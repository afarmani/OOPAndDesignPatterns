package com.afarmani.patterns.behavioral.behavioral.command.framework;

import com.afarmani.patterns.behavioral.behavioral.command.editor.HtmlDocument;

//this command can be execute and unexecuted.
public class BoldCommand implements UndoableCommand {
    //this command maintains a reference to the previous content.
    private String prevContent;
    private HtmlDocument htmlDocument;
    private CommandHistory commandHistory;

    public BoldCommand(HtmlDocument htmlDocument, CommandHistory commandHistory) {
        this.htmlDocument = htmlDocument;
        this.commandHistory = commandHistory;
    }

    //inherited from the UndoableCommand interface
    @Override
    public void unexecute() {
        htmlDocument.setContent(prevContent);
    }

    //inherited from the Command interface
    @Override
    public void execute() {
        //on execute store the previous content.
        prevContent = htmlDocument.getContent();
        htmlDocument.makeBold();
        //push the current object into the history
        commandHistory.push(this);

    }
}
