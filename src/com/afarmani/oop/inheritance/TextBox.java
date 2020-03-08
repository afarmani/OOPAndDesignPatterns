package com.afarmani.oop.inheritance;

public class TextBox extends BoxController {

    //come from the interface class
    TextBox(float size, float position){
        resize(size);
        setPosition(position);
    }

    //come from the abstract class
    @Override
    public void setPosition(float coordinates) {
        setCoordinates(coordinates);
    }

    //come from the abstract class
    @Override
    public void resize(float size) {
        setSize(size);
    }
}
