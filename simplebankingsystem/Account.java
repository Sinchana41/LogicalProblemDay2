package com.oops.simplebankingsystem;

public class Account {

	private  int accountNumber;
	private  Customer customer;
	private  double balance;
	private  String[] transactions;
	private  int transactionCount;

	public Account(int accountNumber, Customer customer) {
		this.setAccountNumber(accountNumber);
		this.customer = customer;
		this.balance = 0.0;
		this.transactions = new String[100];
		this.transactionCount = 0;
		addTransaction("Account created");
	}

	public void deposit(double amount) {
		if (amount <= 0) return;
		balance += amount;
		addTransaction("Deposited: ₹" + amount);
	}

	public void withdraw(double amount) {
		if (amount <= 0 || amount > balance) {
			addTransaction("Withdrawal failed: ₹" + amount);
			return;
		}
		balance -= amount;
		addTransaction("Withdrawn: ₹" + amount);
	}

	public void printStatement() {
		System.out.println("Account Statement for " + customer.getName() + " Acc: " + getAccountNumber() );
		System.out.println("Current Balance: ₹" + balance);
		for (int i = 0; i < transactionCount; i++) {
			System.out.println((i + 1) + ". " + transactions[i]);
		}
	}

	private void addTransaction(String info) {
		if (transactionCount < transactions.length) {
			transactions[transactionCount++] = info;
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
