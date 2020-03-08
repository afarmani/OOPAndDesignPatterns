package com.afarmani.oop.abstraction;

public class MailService {
    public boolean sendEmail(String emailBody){
        connect();
        send(emailBody);
        disconnect();
        authenticate();
        return true;
    }

    /** Make the implementation details of this class hidden by using private modifiers
     * by doing this if the implementation details change, the client code does not need
     * to be changed as well*/

    private void connect(){
        System.out.println("Connect");
    }

    private void send(String emailBody){
        System.out.println("Email Body sent: " + emailBody);
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("authenticate");
    }
}
