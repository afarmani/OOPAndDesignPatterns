package com.afarmani.patterns.behavioral.behavioral.command.editor;

//the business layer of the application it is not aware of the commands framework.
public class HtmlDocument {
    private String content;

    public void makeBold(){
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
