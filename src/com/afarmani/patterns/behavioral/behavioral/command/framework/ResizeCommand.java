package com.afarmani.patterns.behavioral.behavioral.command.framework;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resizing");
    }
}
