package com.afarmani.oop.inheritance;

public class LargeTextBox extends TextBox {

    LargeTextBox(float size, float position) {
        //calls the constructor of the super class
        super(size, position);
    }

    @Override
    public void setSize(float size) {
        super.setSize(size);
    }

}
