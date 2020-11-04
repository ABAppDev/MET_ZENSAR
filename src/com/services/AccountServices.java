package com.services;

public interface AccountServices {

    public int openAccount(String type, float amount);

    public float deposit(int accNo, float amount);

    public float withdraw(int accNo, float amount);

}
