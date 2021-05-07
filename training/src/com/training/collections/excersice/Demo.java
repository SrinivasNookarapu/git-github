package com.training.collections.excersice;

import java.util.*;

public class Demo {

	public static void main(String[] args) {

		System.out.println("ENter number of details to enter");
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> m = new TreeMap<>();
		int num1 = sc.nextInt();
		for (int i = 0; i < num1 ; i++) {
			System.out.println("Enter Key And Value");
			m.put(sc.nextInt(), sc.next());
		}
		
		EmployeeDetails emp = new EmployeeDetails(m);
		System.out.println("Enter Key to Search");
		System.out.println(emp.getEmployeeName(sc.nextInt()));

	}

}
