package com.afarmani.oop.encapsulation;

public class Account {

    /** Setting the class variables as private ensure other classes wont be allowed
     * to update our class directly
     * */
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        /** before setting the balance you want to make sure that value is greater than 0. */
        if(balance>0){
            this.balance = balance;
        }
    }
}
