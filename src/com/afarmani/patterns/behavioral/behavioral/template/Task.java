package com.afarmani.patterns.behavioral.behavioral.template;

public abstract class Task {

    private Audit audit;

    //two constructors
    //First one accepts audit object from outside, allowing it to be shared across many tasks.
    public Task(Audit audit) {
        this.audit = audit;
    }

    //Second creates an audit object on instantiation of the Task object.
    public Task() {
        this.audit = new Audit();
    }

    public void execute(){
        doExecute();
        audit.record();
    }


/** we need to hide the doExecute method within this class but it needs to be visible to the subclasses.
 * WRONG: private abstract void doExecute(); -> in an abstract class we cant use private & abstract because
 * private methods cannot be inherited by subclasses.
 * RIGHT: Instead we can use protected. This makes this method only accessible to those objects within the same
 * package or the subclasses that inherit this objects behaviour.
 * Classes outside of this package can only use the execute() method. doExecute() becomes internal.
 */
    protected abstract void doExecute();
}
