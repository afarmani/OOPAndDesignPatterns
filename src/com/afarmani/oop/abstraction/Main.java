package com.afarmani.oop.abstraction;

public class Main {
    /** the purpose of abstraction is to hide the implementation complexity of your code
     * a client service only needs to be concerned about the inputs and the outputs.*/
    public static void main(String[] args) {
        MailService ms = new MailService();
        /** Clients do not care about connecting, authenticate and then disconnecting in the following
         * example. Client only care that the email text has been send and a boolean value is
         * returned to confirm delivery.
         * */

        ms.sendEmail("Please reply to this email");
    }
}
