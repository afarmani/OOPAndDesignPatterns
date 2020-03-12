package com.afarmani.patterns.behavioral.behavioral.command.framework;

import java.util.*;

//History will need to maintain a stack of commands that can be undone.
public class CommandHistory {

    //use deque so that we can add and remove from the front or back of the queue
    private Deque<UndoableCommand> history = new ArrayDeque<>();

    public void push(UndoableCommand uc){
        history.push(uc);
    }

    public UndoableCommand pop(){
        return history.pop();
    }

    public int size(){
        return history.size();
    }
}
