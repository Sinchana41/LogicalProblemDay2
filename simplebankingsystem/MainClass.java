package com.oops.simplebankingsystem;

public class MainClass {


	public static void main(String[] args) {
		Bank bank = new Bank(10);

		Account a1 = bank.createAccount("Sinchana");
		Account a2 = bank.createAccount("sushma");

		a1.deposit(5000);
		a1.withdraw(1000);
		a1.withdraw(6000); // should fail
		a1.deposit(2000);

		a2.deposit(10000);
		a2.withdraw(2500);

		a1.printStatement();
		System.out.println();
		a2.printStatement();
	}


}
