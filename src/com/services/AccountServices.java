package com.services;

import com.exceptions.InsufficiantAccountBalanceException;
import com.exceptions.InvalidAccountException;
import com.services_impl.AccountServicesImplementation;

public interface AccountServices {

  int openAccount(String type, float amount);

  float deposit(int accNo, float amount);

  float withdraw(int accNo, float amount)
      throws InvalidAccountException, InsufficiantAccountBalanceException;

  void checkBalance(int accNo);

  AccountServicesImplementation fundTransfer(
      int srcAccNo, int destAccNo, AccountServicesImplementation dest, float amount)
      throws InvalidAccountException, InsufficiantAccountBalanceException;
}
