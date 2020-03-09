package com.afarmani.patterns.behavioral.behavioral.observer;

public interface Observer {

    //"Push Style" allows values to be pushed to subscribed objects
    void updatePush(int val);

    //"Pull Style" using this we tell the subscribed objects to retrieve the values.
    void updatePull();

}
