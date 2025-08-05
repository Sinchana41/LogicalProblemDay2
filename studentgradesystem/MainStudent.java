package com.oops.studentgradesystem;

public class MainStudent {

	public static void main(String[] args) {
        Subject[] subjects = new Subject[3];
        subjects[0] = new Subject("Math", 85);
        subjects[1] = new Subject("Science", 78);
        subjects[2] = new Subject("English", 88);

        Student student = new Student("sushma", 101, subjects);
        ReportCard report = new ReportCard(student);
        report.printReport();
    }
}
