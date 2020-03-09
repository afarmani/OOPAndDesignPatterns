package com.afarmani.patterns.behavioral.behavioral.iterator;
/** Iterator pattern allows you to access elements of an object sequentially without exposing
 * its underlying representation.
 *
 * In the following example we have browser and we want to traverse the sites we visited in the past.
 *
 * The solution requires us to create an object to store the history (HistoryManager) and
 * an iterator interface that we can use to implement the logic to traverse the history.
 *
 * The reason we use an interface is to decouple the logic to add to the history and the logic to
 * traverse the history.
 * */
public class IteratorMain {
    public static void main(String[] args) {

        //as we are using generics for the history managers, we can pass class types other than Sites.
        HistoryManager<Sites> historyManager = new HistoryManager<>();
        Iterator iterator = historyManager.createIterator();

        historyManager.push(new Sites("Http://www.google.com"));
        historyManager.push(new Sites("Http://www.yahoo.com"));
        historyManager.push(new Sites("Http://www.reddit.com"));

        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
        iterator.previous();
        System.out.println(iterator.current());
        /** OUTPUT
         * Sites{url='Http://www.google.com'}
         * Sites{url='Http://www.yahoo.com'}
         * Sites{url='Http://www.reddit.com'}
         * Sites{url='Http://www.yahoo.com'}
         *
         * */
    }
}
