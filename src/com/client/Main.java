package com.client;

import com.exceptions.InsufficiantAccountBalanceException;
import com.exceptions.InvalidAccountException;
import com.providers.BusinessComponentProvider;
import com.services.AccountServices;
import com.services_impl.AccountServicesImplementation;

// Main Client Code Program

/** User Interaction Class */
public class Main {

  public static void main(String[] args) {

    // Getting Business Component From Provider
    AccountServices services = BusinessComponentProvider.provideObject();
    AccountServices services2 = BusinessComponentProvider.provideObject();

    // Create Account
    int accNo = services.openAccount("SC", 600000);
    System.out.println("New Account " + accNo + " Created");

    // Deposit Amount In Account
    float balance = services.deposit(10001, 70000.0f);
    System.out.println("Balance Reflected: " + balance);

    try {
      balance = services.withdraw(10001,500);
      System.out.println("Balance Reflected: " + balance);

    } catch (InvalidAccountException | InsufficiantAccountBalanceException e) {
      e.printStackTrace();
    }

    // Create Account2
    int accNo2 = services2.openAccount("CA", 5000);
    System.out.println("\nNew Account " + accNo2 + " Created");

    // Deposit Amount In Account
    float balance2 = services2.deposit(10002, 5500.0f);
    System.out.println("Balance Reflected: " + balance2);


    try {
      services2 = services.fundTransfer(10001, 10002, (AccountServicesImplementation) services2, 5000);
    } catch (InvalidAccountException | InsufficiantAccountBalanceException e) {
      e.printStackTrace();
      System.err.println(e.getMessage());
    }

    services.checkBalance(10001);
    services2.checkBalance(10002);









  }
}
