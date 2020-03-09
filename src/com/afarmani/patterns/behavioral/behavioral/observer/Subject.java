package com.afarmani.patterns.behavioral.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//contains all the methods to maintain the observer list.
public class Subject {

    private List<Observer> obs = new ArrayList<>();

    public void addObserver(Observer observer){
        obs.add(observer);
    }
    public void removeObserver(Observer observer){
        obs.remove(observer);
    }

    //push style pushes the value to all registered observers
    public void notifyObserversPushStyle(int value){
        for(Observer ob: obs){
            ob.updatePush(value);
        }
    }
    //pull style tells the subscribed objects to come and retrieve the value.
    public void notifyObserversPullStyle(){
        for(Observer ob: obs){
            ob.updatePull();
        }
    }
}
