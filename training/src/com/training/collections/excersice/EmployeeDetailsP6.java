package com.training.collections.excersice;

import java.util.*;

public class EmployeeDetailsP6 {
	
	static String getEmployeeName(int givenId, Map<Integer, String> data){
		
		return data.get(givenId);
		
	}

	public static void main(String[] args) {
		System.out.println("enter the Size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Map<Integer, String> data = new HashMap<>();
		int key = 1;
		System.out.println("Enter Employee data to Map");
		for (int i = 0; i < size ; i++) {
			data.put(key, sc.next());
			key++;
		}
		System.out.println("ENter kay to Find By Key");
		Integer id = sc.nextInt();
		
		//System.out.println(data.get(id));
		
		System.out.println(getEmployeeName(id, data));

	}

}
