package com.client;

import com.providers.BusinessComponentProvider;
import com.services.AccountServices;


//Main Client Code Program

/**
 * User Interaction Class
 */
public class Main {


    public static void main(String[] args) {

        //Getting Business Component From Provider
        AccountServices services = BusinessComponentProvider.provideObject();

        //Create Account
        int accNo = services.openAccount("CA", 600000);
        System.out.println("New Account " + accNo + " Created");

        //Deposit Amount In Account
        float balance = services.deposit(10001, 70000.0f);
        System.out.println("Balance Reflected: " + balance);
    }
}
