package com.afarmani.oop.encapsulation;

public class Main {
    public static void main(String[] args){
        /**encapsulation is concept that protects classes from being updated directly by other classes.
         * You would want to this to ensure integrity of your classes by controlling what values are being
         * set within the class by using public methods.
         **/

        Account account = new Account();
        account.setBalance(10);

    }
}
