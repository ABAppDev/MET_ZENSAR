package com.met.zensar.accounting_project;
//EntryPoint

public class MainAccount {

	public static void main(String[] args) {
		AccountServices A = new AccountServices();

		A.createAccount( "Abhishek", "SAV", 300);
		A.getAccountInfo();
		System.out.println("Deposite " + (A.deposit(5000) ? "Successfull" : "Failed"));
		System.out.println("Withdrawel " + (A.withdraw(2100) ? "Successfull" : "Failed"));
		A.checkBalance();

		AccountServices B = new AccountServices();
		B.createAccount( "Alex", "SAV",300);
		B.getAccountInfo();

		System.out.println("Deposite " + (B.deposit(3250) ? "Successfull" : "Failed"));
		System.out.println("Withdrawel " + (B.withdraw(100) ? "Successfull" : "Failed"));
		B.checkBalance();

		B = A.fundTransfer(B, 350);

		A.checkBalance();
		B.checkBalance();

	}
}