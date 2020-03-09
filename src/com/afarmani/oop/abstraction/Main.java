package com.afarmani.oop.abstraction;

/** the purpose of abstraction is to hide the implementation complexity of your code
 * a client service only needs to be concerned about the inputs and the outputs.
 *
 * Clients do not care about connecting, authenticate and then disconnecting in the following
 * example. Client only care that the email text has been send and a boolean value is
 * returned to confirm delivery.
 * */
public class Main {

    public static void main(String[] args) {
        MailService ms = new MailService();

        ms.sendEmail("Please reply to this email");
    }
}
