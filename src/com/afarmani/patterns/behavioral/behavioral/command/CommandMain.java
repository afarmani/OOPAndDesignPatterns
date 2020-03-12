package com.afarmani.patterns.behavioral.behavioral.command;

import com.afarmani.patterns.behavioral.behavioral.command.editor.HtmlDocument;
import com.afarmani.patterns.behavioral.behavioral.command.framework.*;

/**
 * The purpose of this project is to maintain a list of activities, allowing a client to execute any
 * of the activities, as well as to maintain a history and provide the functionality to undo those
 * activities
 *
 * Three types of Command Patterns:
 * Regular Command Pattern
 * Composite Command Pattern
 * Undoable Command Pattern
 * */
public class CommandMain {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();
        /**
         * Output:
         * Adding customer
         */

        //Composite Command Example (Allows you to replay commands):
        CompositeCommand cc = new CompositeCommand();
        cc.addCommand(new ResizeCommand());
        cc.addCommand(new BWFilterCommand());
        cc.execute();
        /** Output:
         * Resizing
         * Apply Black and White Filter
         */

        //Undoable Command Example
        CommandHistory commandHistory = new CommandHistory();
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.setContent("Hello world");

        BoldCommand boldCommand = new BoldCommand(htmlDocument, commandHistory);
        boldCommand.execute();

        System.out.println(htmlDocument.getContent());
        /**
         * Output:
         * <b>Hello world</b>
         */

        boldCommand.unexecute();
        System.out.println(htmlDocument.getContent());
        /**
         * Output:
         * Hello world
         */

        boldCommand.execute(); // set it back to bold to test next piece
        //Undoable command using Undo Object
        UndoCommand undo = new UndoCommand(commandHistory);
        undo.execute();
        System.out.println(htmlDocument.getContent());
        /**
         * Output:
         * Hello world
         */
    }

}
