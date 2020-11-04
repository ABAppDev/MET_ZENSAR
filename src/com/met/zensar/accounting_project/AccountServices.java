package com.met.zensar.accounting_project;
//AccountServices

public class AccountServices {

	private Account ac;

	//creating account
	public int createAccount(String CName, String Type, float initialBalance) {
		ac = new Account(CName, Type, initialBalance);
		System.out.println("\nAccount Created");
		return ac.getAccNo();
	}

	//deposit in account returns true if successful
	public boolean deposit(final float amount) {
		ac.setBalance(ac.getBalance() + amount);
		return true;
	}

	//deposit in withdraw returns true if successful
	public boolean withdraw(final float amount) {
		if (ac.getBalance() - amount < 0)	//if fund is insufficient
			return false;
		else {
			ac.setBalance(ac.getBalance() - amount);
			return true;
		}
	}

	//return current balance
	public void checkBalance() {
		System.out.println("\n\nAccount Balance: " + ac.getBalance());
	}

	//transfer amount between two account
	public AccountServices fundTransfer(AccountServices dest, float amount) {
		if (ac.getBalance() - amount < 0)	//if balance insufficient
			System.out.println("\n\nInsufficient Balance. Fund Transfer Failed.");
		else {
			this.withdraw(amount);
			dest.deposit(amount);
			System.out.println("\n\nAmount " + amount + " transferred");
		}
		return dest;
	}

	//complete account information
	public void getAccountInfo() {
		System.out.println(ac.toString());
	}

}