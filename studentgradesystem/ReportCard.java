package com.oops.studentgradesystem;

public class ReportCard {

	Student student;

	ReportCard(Student student) {
		this.student = student;
	}

	int calculateTotal() {
		int total = 0;
		for (int i = 0; i < student.getSubjects().length; i++) {
			total += student.getSubjects()[i].getMarks();
		}
		return total;
	}

	double calculateAverage() {
		return (double) calculateTotal() / student.getSubjects().length;
	}

	char calculateGrade() {
		double avg = calculateAverage();
		if (avg >= 90) return 'A';
		else if (avg >= 75) return 'B';
		else if (avg >= 60) return 'C';
		else if (avg >= 40) return 'D';
		else return 'F';
	}

	void printReport() {
		System.out.println("Student Name: " + student.getName());
		System.out.println("Roll Number: " + student.getRollNumber());
		System.out.println("Subjects and Marks:");
		for (int i = 0; i < student.getSubjects().length; i++) {
			System.out.println("  " + student.getSubjects()[i].getName() + ": " + student.getSubjects()[i].getMarks());
		}
		System.out.println("Total: " + calculateTotal());
		System.out.println("Average: " + calculateAverage());
		System.out.println("Grade: " + calculateGrade());
	}
}
