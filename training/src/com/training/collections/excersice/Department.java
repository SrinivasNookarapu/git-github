package com.training.collections.excersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Department {
	
	int deptartment_id;
	String deptartment_name;
	List<Course> list;
	

	public Department() {
		super();
	}

	public Department(int deptartment_id, String deptartment_name) {
		super();
		this.deptartment_id = deptartment_id;
		this.deptartment_name = deptartment_name;
	}

	
	public void addCourseToDepartment() {
		Scanner sc = new Scanner(System.in);
		 list = new ArrayList<>();
		System.out.println("Enter No Of Courses");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter "+(i + 1)+" Course Details");
			list.add(new Course(sc.nextInt(), sc.next()));
		}
		
	}
	
	@Override
	public String toString() {
		return "Department [deptartment_id=" + deptartment_id + ", deptartment_name=" + deptartment_name + ", Course ="
				+ list + "]";	
	}

	public static void main(String[] args) {
		
		
		System.out.println("Enter Deratment Id and name");
		Scanner sc = new Scanner(System.in);		
        Department d = new Department(sc.nextInt(),sc.next());		
        d.addCourseToDepartment();
        Course c = new Course();
        c.addStudentToCourse();
       
        System.out.println(d);
        System.out.println(c);
        
	}

}
