package com.afarmani.patterns.behavioral.behavioral.command.framework;

public class Button {
    private String label;
    private Command command;


    public Button(Command command) {
        this.command = command;
    }

    public void click(){
        //we are delegating the actual work to the Command object.
        command.execute();

    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
