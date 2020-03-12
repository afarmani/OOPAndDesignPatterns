package com.afarmani.patterns.behavioral.behavioral.command.framework;

/**
 * We introduce a new interface to undo commands, the reason for this is that not
 * every command would need to be undone.
 *
 * When another object implements undoable command, they will have to write their
 * own implementations for execute and unexecute.
 */

public interface UndoableCommand extends Command {
    void unexecute();
}
