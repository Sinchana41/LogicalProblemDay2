package com.oops.studentgradesystem;

public class Student {

	private  String name;
	private  int rollNumber;
	private  Subject[] subjects;

	Student(String name, int rollNumber, Subject[] subjects) {
		this.setName(name);
		this.setRollNumber(rollNumber);
		this.setSubjects(subjects);
	}

	public Subject[] getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
}
