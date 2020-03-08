package com.afarmani.patterns.behavioral.behavioral.state;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush tool clicked");
    }

    @Override
    public void mouseUp() {
        System.out.println("Brush tool selected");
    }
}
