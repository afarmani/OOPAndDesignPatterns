package com.afarmani.patterns.behavioral.behavioral.template;

//maintain all transfer in audit
public class TransferTask extends Task {
    @Override
    protected void doExecute() {
        //by extending task object we only need to focus on the logic of executing a transfer.
        System.out.println("Executing Transfer");
    }

    public void test(){};

}
