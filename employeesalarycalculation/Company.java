package com.oops.employeesalarycalculation;

public class Company {

	 public static void main(String[] args) {
	        FullTimeEmployee ft = new FullTimeEmployee("Ram", 101, 50000);
	        PartTimeEmployee pt = new PartTimeEmployee("Seetha", 102, 200, 20);
	        Contractor ct = new Contractor("Laxman", 103, 30000);

	        ft.display();
	        pt.display();
	        ct.display();
	    }
}
