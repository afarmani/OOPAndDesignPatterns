package com.afarmani.patterns.behavioral.behavioral.state;

public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("selection tool clicked");
    }

    @Override
    public void mouseUp() {
        System.out.println("selection tool selected");
    }
}
