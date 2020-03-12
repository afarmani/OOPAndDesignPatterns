package com.afarmani.patterns.behavioral.behavioral.command.framework;

public class BWFilterCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Apply Black and White Filter");
    }
}
