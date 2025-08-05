package com.oops.employeesalarycalculation;

abstract class Employee {

	    String name;
	    int id;

	    public Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public abstract double calculateSalary();

	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Salary: " + calculateSalary());      
	    }
}
