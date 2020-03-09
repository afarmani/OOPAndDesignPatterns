package com.afarmani.oop.inheritance;

/** Inheritance allows you to reuse code when your classes have common behaviours,
 * by allowing classes to inherit the behaviours of other classes.
 * This is also known as an IS-A relationship.
 * */

public class Main {
    public static void main(String[] args) {

        Box textBox = new TextBox(100, 50);
        Box largeTextBox = new LargeTextBox(150, 45);

        System.out.println(textBox);
        System.out.println(largeTextBox);

    }
}
