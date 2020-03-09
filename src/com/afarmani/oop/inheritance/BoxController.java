package com.afarmani.oop.inheritance;

/** an abstract class can implement an interface, and not provide implementations of all of the interface's methods.
 * It is the responsibility of the first concrete class that extends this abstract class to implement all of the
 * methods in the interface.
 * */
public abstract class BoxController implements Box{
//We set the Box Controller as abstract so that it can not be created directly.

    private float size;
    private float coordinates;

    //abstract methods do not require its behaviours to be defined, instead it is up to the concrete class.
    //abstract methods, are method declarations with no implementations.
    public abstract void setPosition(float coordinates);
    public abstract void resize(float size);

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(float coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "BoxController{" +
                "size=" + getSize() +
                ", coordinates=" + getCoordinates() +
                '}';
    }
}
