package com.exceptions;

public class InsufficiantAccountBalanceException extends Exception {
  public InsufficiantAccountBalanceException(String MSG) {
    super(MSG);
  }
}
