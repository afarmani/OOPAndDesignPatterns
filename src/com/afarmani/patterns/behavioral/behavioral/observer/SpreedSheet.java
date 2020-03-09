package com.afarmani.patterns.behavioral.behavioral.observer;


public class SpreedSheet implements Observer {
    //**PUSH STYLE**
    //empty constructor required to allow us to switch between pull or push type.
    public SpreedSheet() {
    }

    @Override
    public void updatePush(int val) {
        //the value has been passed to the registered objects.
        System.out.println("spreedsheet have been update. Value: " + val);
    }

    //**PULL STYLE**
    //For pull style each registered object needs to be composed of the datasource object.

    private DataSource ds;

    public SpreedSheet(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public void updatePull() {
        //now on updates of pull style, our registered object will go to datasource and retrieve the value.
        System.out.println("spreedsheet have been update. Value: " + ds.getValue());

        //draw back is that we are now coupled with datasource object, but now we can call any method in datasource. (tradeoff)
    }
}
