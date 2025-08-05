package com.oops.studentgradesystem;

public class ReportCard {

	    Student student;

	    ReportCard(Student student) {
	        this.student = student;
	    }

	    int calculateTotal() {
	        int total = 0;
	        for (int i = 0; i < student.subjects.length; i++) {
	            total += student.subjects[i].marks;
	        }
	        return total;
	    }

	    double calculateAverage() {
	        return (double) calculateTotal() / student.subjects.length;
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
	        System.out.println("Student Name: " + student.name);
	        System.out.println("Roll Number: " + student.rollNumber);
	        System.out.println("Subjects and Marks:");
	        for (int i = 0; i < student.subjects.length; i++) {
	            System.out.println("  " + student.subjects[i].name + ": " + student.subjects[i].marks);
	        }
	        System.out.println("Total: " + calculateTotal());
	        System.out.println("Average: " + calculateAverage());
	        System.out.println("Grade: " + calculateGrade());
	    }
}
