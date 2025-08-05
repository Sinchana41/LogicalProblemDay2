package com.oops.employeesalarycalculation;

public class Company {

	 public static void main(String[] args) {
	        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Ram", 101, 50000);
	        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Seetha", 102, 200, 20);
	        Contractor contractor = new Contractor("Laxman", 103, 30000);

	        fullTimeEmployee.display();
	        partTimeEmployee.display();
	        contractor.display();
	    }
}
