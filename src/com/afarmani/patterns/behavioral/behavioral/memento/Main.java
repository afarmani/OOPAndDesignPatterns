package com.afarmani.patterns.behavioral.behavioral.memento;
/**
 * Memento patterns are a behavioural pattern used to implement undo mechanisms.
 */

public class Main {

    public static void main(String[] args) {
        History history = new History();
        Editor editor = new Editor();

        //set content of editor object
        editor.setContent("a");
        //save content of editor object & add it to history.
        history.add(editor.saveState());

        editor.setContent("b");
        history.add(editor.saveState());

        editor.setContent("c");
        history.add(editor.saveState());

        editor.restore(history.undo());
        System.out.println(editor.getContent()); // returns "c"

        editor.restore(history.undo());
        System.out.println(editor.getContent()); // returns "b"

        editor.restore(history.undo());
        System.out.println(editor.getContent()); // returns "a"

    }
}
