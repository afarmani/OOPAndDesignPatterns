package com.afarmani.patterns.behavioral.behavioral.state;

/** State design pattern allows your objects to behave differently based on the state of the object
 * In the following example we have a canvas with multiple tool types, such as brush or selection.
 * Based on the state of the tool object the mouse up and mouse down is expected to behave differently.
 * */
public class Main {
    public static void main(String[] args) {

        // brush and selection variables below instantiate two new canvases.
        // Canvas is composed of the Tool objects (HAS-A)
        //set the tools for the canvas, brush and selection classes are the concrete class of tool.
        Canvas brush = new Canvas(new BrushTool());
        Canvas selection = new Canvas(new SelectionTool());

        brush.mouseDown();
        brush.mouseUp();

        selection.mouseDown();
        selection.mouseUp();
        /** OUTPUT:
         * Brush tool clicked
         * Brush tool selected
         * selection tool clicked
         * selection tool selected
         * */
    }

}
