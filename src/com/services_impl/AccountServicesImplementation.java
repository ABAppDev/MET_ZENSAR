package com.services_impl;
// AccountServices

import com.beans.Account;
import com.dao_services.DatabaseOperations;
import com.exceptions.InsufficiantAccountBalanceException;
import com.exceptions.InvalidAccountException;
import com.providers.DatabaseObjectProvider;
import com.services.AccountServices;

public class AccountServicesImplementation implements AccountServices {

  private Account ac;
  private DatabaseOperations databaseOperations;

  public AccountServicesImplementation() {
    databaseOperations = DatabaseObjectProvider.getDAOObject();
  }

  /**
   * Create New Account
   *
   * @param Type account_type
   * @param initialBalance opening_balance
   * @return account_number
   */
  public int openAccount(String Type, float initialBalance) {
    ac = new Account(Type, initialBalance);
    databaseOperations.insertNewAccount(ac);
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
   * @param accNo account_number
   * @param amount amount
   * @return balance
   */
  public float deposit(int accNo, final float amount) {
    float updated_balance = 0;
    if (isAccountValid(accNo)) {
      ac.setBalance(ac.getBalance() + amount);
      databaseOperations.updateBalance(ac.getAccNo(), ac.getBalance());
      updated_balance = ac.getBalance();
    }
    return updated_balance;
  }

  /**
   * Deposit in withdraw returns true if successful
   *
   * @param accNo account_number
   * @param amount amount
   * @return balance
   */
  public float withdraw(int accNo, float amount)
      throws InvalidAccountException, InsufficiantAccountBalanceException {
    float updated_balance = 0;

    if (isAccountValid(accNo)) {

      if (!(ac.getBalance() - amount < 0)) {

        ac.setBalance(ac.getBalance() - amount);
        databaseOperations.updateBalance(ac.getAccNo(), ac.getBalance());
        updated_balance = ac.getBalance();

      } else throw new InsufficiantAccountBalanceException("Not Enough Balance In Account");

    } else throw new InvalidAccountException("Account Details Invalid");

    return updated_balance;
  }

  // return current balance
  public void checkBalance(int accNo) {
    if (isAccountValid(accNo))
      databaseOperations.getAccountDetails(accNo);
    else System.out.println("Account Number Invalid");
  }

  // complete account information
  public void getAccountInfo() {
    databaseOperations.getAccountDetails(ac.getAccNo());
  }

  // transfer amount between two account
  public AccountServicesImplementation fundTransfer(
      int srcAccNo, int destAccNo, AccountServicesImplementation dest, float amount)
      throws InvalidAccountException, InsufficiantAccountBalanceException {

    if (this.isAccountValid(srcAccNo) && dest.isAccountValid(destAccNo)) {

      if (ac.getBalance() - amount < 0) // if balance insufficient
      {
        System.out.println("Insufficient Balance. Fund Transfer Failed.");

      } else {
        this.withdraw(srcAccNo, amount);
        dest.deposit(destAccNo, amount);
        System.out.println("\nAmount " + amount + " transferred");
      }

    } else {
      System.out.println("One More Account Number Invalid");
    }

    return dest;
  }
}
