package com.dao_services;

import ab.met.zensar.accounting_project.Account;

public interface DatabaseOperations {
   int insertNewAccount(Account AC);

   void updateBalance(int accNo, float Balance);

   void getAccountDetails(int accNo);
}
