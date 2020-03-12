package com.afarmani.patterns.behavioral.behavioral.command.framework;


//will check the history object and retrieve the previous content.
public class UndoCommand implements Command {

    private CommandHistory commandHistory;

    public UndoCommand(CommandHistory commandHistory) {
        this.commandHistory = commandHistory;
    }

    @Override
    public void execute() {
        if(commandHistory.size()>0){
            commandHistory.pop().unexecute();
        }
    }
}
