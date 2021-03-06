package com.beans;

/** Account Bean Class Holds Account Detail */
public class Account {
  private int accNo;
  private float balance;
  private String type;
  private static int acCounter = 1200;

  /**
   * @param type type
   * @param balance opening_balance
   */
  public Account(String type, float balance) {
    this.accNo = ++acCounter;
    this.balance = balance;
    this.type = type;
  }

  /** @return get Account Number */
  public int getAccNo() {
    return accNo;
  }

  /** @return get Account Balance */
  public float getBalance() {
    return balance;
  }

  /** @param balance set Account balance */
  public void setBalance(float balance) {
    this.balance = balance;
  }

  /** @return set Account Type */
  public String getType() {
    return type;
  }

  /** @return AccountDetails As String */
  public String toString() {
    return "\n\nAccount Details\n\tAccount No="
        + accNo
        + "\n\tBalance="
        + balance
        + "\n\tAccount Type="
        + type;
  }
}
