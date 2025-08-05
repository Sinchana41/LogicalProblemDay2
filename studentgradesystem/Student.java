package com.oops.studentgradesystem;

public class Student {

	    String name;
	    int rollNumber;
	    Subject[] subjects;

	    Student(String name, int rollNumber, Subject[] subjects) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.subjects = subjects;
	    }
}
