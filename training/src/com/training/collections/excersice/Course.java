package com.training.collections.excersice;


import java.util.*;
import java.util.Scanner;

public class Course {
	
	int course_id;
	String course_name;
	List<Student> list;
	
	public Course() {
		super();
	}
	
	public Course(int course_id, String course_name) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
	}
	
	public void addStudentToCourse() {
		Scanner sc = new Scanner(System.in);
		list = new ArrayList<>();
		System.out.println("Enter No Of Students");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter "+(i + 1)+" Sudent Details");
			list.add(new Student(sc.nextInt(), sc.next(), sc.nextInt()));
		}
		
	}
	
	public void displayCourseDetails() {
		System.out.println("Course [course_id=" + course_id + ", course_name=" + course_name+ " " );
		for (Student student : list) {
			System.out.println(student);
		}
	}

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", list=" + list + "]";
	}

	
	
	
	
	
	
	
}
