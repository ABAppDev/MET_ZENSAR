package com.dao_services;

import com.beans.Account;

public interface DatabaseOperations {
   int insertNewAccount(Account AC);

   void updateBalance(int accNo, float Balance);

   void getAccountDetails(int accNo);
}
