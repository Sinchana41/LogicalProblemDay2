package com.oops.simplebankingsystem;

public class Customer {

	private	String name;
	private int customerId;

	public Customer(String name, int customerId) {
		this.setName(name);
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
