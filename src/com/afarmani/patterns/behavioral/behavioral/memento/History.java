package com.afarmani.patterns.behavioral.behavioral.memento;

import java.util.Stack;

/** In OOP principals every class should have a single responsibility, therefore
 * we create a history class to maintain the history of states for the Editor Object.
 *
 * We use composition here, the History Object is composed of editor states
 * We use stack here because it will maintain the order of states (last in first out)
 *
 * Stack is a direct subclass of Vector; this means that similarly to its superclass,
 * it's a synchronized implementation. Therefore we do not need to implement synchronization
 * ourselves. If synchronization is not required we can also use ArrayDeque.
 */


public class History {
    Stack<EditorState> states = new Stack<>();

    public void add(EditorState es){
        states.push(es);
    }

    public EditorState undo(){
        //avoid EmptyStackException by checking if the states is empty before calling pop
        if(!states.empty()) {
            return states.pop();
        } else return null;
    }
}
