package com.services;

import com.services_impl.AccountServicesImplementation;

public interface AccountServices {

  int openAccount(String type, float amount);

  float deposit(int accNo, float amount);

  float withdraw(int accNo, float amount);

  void checkBalance(int accNo);

  AccountServicesImplementation fundTransfer(
          int srcAccNo, int destAccNo, AccountServicesImplementation dest, float amount);
}
