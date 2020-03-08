package com.afarmani.patterns.behavioral.behavioral.state;

public class Canvas implements Tool{

    private Tool currentTool;

    public Canvas(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    @Override
    public void mouseDown() {
        currentTool.mouseDown();
    }

    @Override
    public void mouseUp() {
        currentTool.mouseUp();
    }
}
