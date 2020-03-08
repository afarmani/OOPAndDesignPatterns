package com.afarmani.patterns.behavioral.behavioral.state;

/** State design pattern allows your objects to behave differently based on the state of the object
 * In the following example we have a canvas with multiple tool types, such as brush or selection.
 * Based on the state of the tool object the mouse up and mouse down is expected to behave differently.
 * */
public class Main {
    public static void main(String[] args) {

        // brush and selection variables below instantiate two new canvases.
        // Canvas is composed of Tool objects (HAS-A)
        Canvas brush = new Canvas();
        Canvas selection = new Canvas();

        //set the tools for the canvas, brush and selection classes are the concrete class of tool.
        brush.setCurrentTool(new Brush());
        selection.setCurrentTool(new Selection());

        brush.getCurrentTool().mouseDown();
        brush.getCurrentTool().mouseUp();

        selection.getCurrentTool().mouseDown();
        selection.getCurrentTool().mouseUp();
        /** OUTPUT:
         * Brush tool clicked
         * Brush tool selected
         * selection tool clicked
         * selection tool selected
         * */
    }

}
