package com.afarmani.patterns.behavioral.behavioral.memento;

public class Editor {

    private String content;
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState saveState(){
        //creates and return the Editors state.
        return new EditorState(content);
    }

    public void restore(EditorState state){
        content = state.getContent();
    }

}
