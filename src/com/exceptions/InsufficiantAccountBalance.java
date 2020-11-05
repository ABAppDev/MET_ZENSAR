package com.exceptions;

public class InsufficiantAccountBalance extends Exception {
  public InsufficiantAccountBalance(String MSG) {
    super(MSG);
  }
}
