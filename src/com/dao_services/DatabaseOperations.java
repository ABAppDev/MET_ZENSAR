package com.dao_services;

import ab.met.zensar.accounting_project.Account;

public interface DatabaseOperations {
  public void insertNewAccount(Account AC);

  public void updatebalance(int accNo, float Balance);

  public void getAccountDetails(int accNo);
}
