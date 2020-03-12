package com.afarmani.patterns.behavioral.behavioral.command;

import com.afarmani.patterns.behavioral.behavioral.command.framework.Command;

import java.util.ArrayList;
import java.util.List;

//the purpose of this class is to maintain a list of commands that can be executed.

public class CompositeCommand implements Command {

    List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        this.commands.add(command);
    }

    //iterates list of commands and executes them.
    @Override
    public void execute() {
        for(Command cmd: commands){
            cmd.execute();
        }
    }
}
