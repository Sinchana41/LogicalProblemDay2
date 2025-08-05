package com.oops.simplebankingsystem;

public class Bank {

	    private Account[] accounts;
	    private int accCount;
	    private int nextAccountNumber = 1001;

	    public Bank(int capacity) {
	        accounts = new Account[capacity];
	        accCount = 0;
	    }

	    public Account createAccount(String name) {
	        if (accCount >= accounts.length) return null;
	        Customer customer = new Customer(name, accCount + 1);
	        Account acc = new Account(nextAccountNumber++, customer);
	        accounts[accCount++] = acc;
	        return acc;
	    }

	    public Account getAccountByNumber(int accNo) {
	        for (int i = 0; i < accCount; i++) {
	            if (accounts[i].getAccountNumber() == accNo) return accounts[i];
	        }
	        return null;
	    }
}
