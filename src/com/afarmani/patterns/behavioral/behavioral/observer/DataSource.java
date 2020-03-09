package com.afarmani.patterns.behavioral.behavioral.observer;

/** by extending the subject class, we provide this class all the methods required to become
 * a publisher.
 */
public class DataSource extends Subject {
    //when the value changes other objects need to be notified.
    private int value;

    public int getValue() {
        return value;
    }

    public void setValuePush(int value) {
        this.value = value;
        //once the value has been set we call the inherited method to notify observers.
        notifyObserversPushStyle(this.value);
    }

    public void setValuePull(int value) {
        this.value = value;
        //once the value has been set we call the inherited method to tell the observers.
        notifyObserversPullStyle();
    }
}
