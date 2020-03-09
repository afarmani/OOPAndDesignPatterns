package com.afarmani.patterns.behavioral.behavioral.iterator;

/** to follow the single responsibility principal of OOP, this class should only
 * be responsible of managing the history.
 * Another class should be used to traverse the history
 * */
public class HistoryManager<E> {

    private E[] history;
    int count;

    //create a constructor to initialize the history size.
    public HistoryManager(int historySize){
        this.history = (E[]) new Object[historySize];

    }
    public void push(E e){
        history[count++] = e;
    }
    public E pop(){
        return (E) history[count--];
    }

    //returns the iterator to be used to traverse the siteManager.
    public Iterator createIterator() {

        //pass the manager to the iterator, so that it is aware of all the history objects added
        return new SimpleIterator(this);
    }

    //we can use a nested class to iterate through history list.
    public class SimpleIterator implements Iterator<E> {

        private HistoryManager historyManager;
        //internal index of iterator used to traverse the history.
        private int index;

        public SimpleIterator(HistoryManager historyManager) {
            this.historyManager = historyManager;
        }

        @Override
        public boolean hasNext() {
            //if index is greater than the history manager count reduce index size for next call.
            if(index==historyManager.count){
                index--;
                return false;
            }
            return(index < historyManager.count);
        }

        @Override
        public E current() {
            return (E) historyManager.history[index];
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public void previous() {
            index--;
        }
    }
}
