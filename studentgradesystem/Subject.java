package com.oops.studentgradesystem;

public class Subject {

	private String name;
	private int marks;

    Subject(String name, int marks) {
        this.setName(name);
        this.setMarks(marks);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
