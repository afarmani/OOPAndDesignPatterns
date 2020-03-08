package com.afarmani.patterns.behavioral.behavioral.state;

public class Selection extends Tool {
    @Override
    void mouseDown() {
        System.out.println("selection tool clicked");
    }

    @Override
    void mouseUp() {
        System.out.println("selection tool selected");
    }
}
