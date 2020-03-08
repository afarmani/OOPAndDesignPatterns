package com.afarmani.patterns.behavioral.behavioral.memento;

import java.util.Stack;

/** In OOP principals every class should have a single responsibility, therefore
 * we create a history class to maintain the history of states for the Editor Object.
 */

public class History {

    /** Use composition here, therefore History Object is composed of editor states
     * We use stack here because it will maintain the order of states (last in first out)
     *
     * Stack is a direct subclass of Vector; this means that similarly to its superclass,
     * it's a synchronized implementation. Therefore we do not need to implement synchronization
     * ourselves. If synchronization is not required we can also use ArrayDeque.
     * */

    Stack<EditorState> states = new Stack<>();

    public void add(EditorState es){
        states.push(es);
    }

    public EditorState undo(){
        /** need to check that the stack of states is not empty before using pop
         * if it is empty EmptyStackException will be thrown. Pop will return the
         * last item added to the stack*/
        if(!states.empty()) {
            return states.pop();
        } else return null;
    }
}
