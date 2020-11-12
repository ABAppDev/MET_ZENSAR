package com.dao_services;

import com.beans.Account;

/** Interface For Database Operations */
public interface DatabaseOperations {

  /**
   * Creates New Account In Database
   * @param AC Account Class Object
   * @return Number Of Rows Affected
   */
  int insertNewAccount(Account AC);

  boolean isAccountExists(int NUM);

  /**
   * Updates Account  Balances
   * @param accNo Account Number
   * @param Balance New Balance To Set
   */
  void updateBalance(int accNo, float Balance);

  /**
   * Displays Account Details By Account Number
   * @param accNo Account Number
   */
  void getAccountDetails(int accNo);
}
