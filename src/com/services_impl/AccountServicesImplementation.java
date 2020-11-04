package com.services_impl;
//AccountServices

import com.beans.Account;
import com.services.AccountServices;

public class AccountServicesImplementation implements AccountServices {

    private Account ac;

    /**
     * Create New Account
     *
     * @param Type           account_type
     * @param initialBalance opening_balance
     * @return account_number
     */
    public int openAccount(String Type, float initialBalance) {
        ac = new Account(Type, initialBalance);
        return ac.getAccNo();
    }


    /**
     * isAccountValids Account
     *
     * @param accNo account_number
     * @return isValid
     */
    public boolean isAccountValid(int accNo) {
        return accNo == ac.getAccNo();
    }


    /**
     * Deposit in account returns balance if successful
     *
     * @param accNo  account_number
     * @param amount amount
     * @return balance
     */
    public float deposit(int accNo, final float amount) {
        float updated_balance = 0;
        if (isAccountValid(accNo)) {
            ac.setBalance(ac.getBalance() + amount);
            updated_balance = ac.getBalance();
        }
        return updated_balance;
    }


    /**
     * Deposit in withdraw returns true if successful
     *
     * @param accNo  account_number
     * @param amount amount
     * @return balance
     */
    public float withdraw(int accNo, float amount) {
        float updated_balance = 0;
        if (!(ac.getBalance() - amount < 0) && isAccountValid(accNo))    //if fund is insufficient
        {
            ac.setBalance(ac.getBalance() - amount);
            updated_balance = ac.getBalance();
        }
        return updated_balance;
    }


    //return current balance
    public void checkBalance(int accNo) {
        if (isAccountValid(accNo))
            System.out.println("\n\nAccount Balance: " + ac.getBalance());
        else
            System.out.println("\n\nAccount Number Invalid");
    }


    //complete account information
    public void getAccountInfo() {
        System.out.println(ac.toString());
    }





 /*
    //transfer amount between two account
    public AccountServicesImplementation fundTransfer(AccountServicesImplementation dest, float amount) {
        if (ac.getBalance() - amount < 0)    //if balance insufficient
            System.out.println("\n\nInsufficient Balance. Fund Transfer Failed.");
        else {
            this.withdraw(amount);
            dest.deposit(amount);
            System.out.println("\n\nAmount " + amount + " transferred");
        }
        return dest;
    }

     */


}