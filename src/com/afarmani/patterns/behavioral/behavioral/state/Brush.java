package com.afarmani.patterns.behavioral.behavioral.state;

public class Brush extends Tool {
    @Override
    void mouseDown() {
        System.out.println("Brush tool clicked");
    }

    @Override
    void mouseUp() {
        System.out.println("Brush tool selected");
    }
}
