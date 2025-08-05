package com.oops.employeesalarycalculation;

public class Contractor extends Employee{

	    private double contractAmount;

	    public Contractor(String name, int id, double contractAmount) {
	        super(name, id);
	        this.contractAmount = contractAmount;
	    }

	    @Override
	    public double calculateSalary() {
	        return contractAmount;
	    }
}
