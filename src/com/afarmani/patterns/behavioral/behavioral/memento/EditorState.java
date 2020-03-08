package com.afarmani.patterns.behavioral.behavioral.memento;

public class EditorState {

    //on initialization of the EditorState object, the content can not be changed.
    private final String Content;

    public EditorState(String content) {
        Content = content;
    }

    public String getContent() {
        return Content;
    }
}
