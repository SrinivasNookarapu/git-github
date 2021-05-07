package com.training.collections.excersice;

public class Student {
	
	int student_id;
	String student_name;
	int student_marks;
	
	public Student() {
		super();
	}
	
	public Student(int student_id, String student_name, int student_marks) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_marks = student_marks;
	}
	
	public void displayStudentDetails() {
		System.out.println("studentName " +student_name+ " studentId= "+student_id+ "marks = "+student_marks);
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_marks="
				+ student_marks + "]";
	}
	
	
	

}
