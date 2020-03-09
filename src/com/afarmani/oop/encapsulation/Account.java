package com.afarmani.oop.encapsulation;

public class Account {
    //set balance as private to block other classes from updating it directly
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        //before setting the balance you want to make sure that value is greater than 0.
        if(balance>0){
            this.balance = balance;
        }
    }
}
