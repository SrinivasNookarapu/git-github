package com.training.collections.excersice;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class EmployeeDetailsP7 {
	
	static Set<Integer> getEmployeeIdFromName(String givenName, Map<Integer, String> data){
		Set<Integer> set = new HashSet<>();
		for (Map.Entry<Integer, String> e : data.entrySet()) {
			if(e.getValue().equals(givenName)) {
				set.add(e.getKey());
			}
		}
		
		return set;
		
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
		
		// Java 8 feature
	 /*	System.out.println("Enter Name to print Id");
		String name = sc.next();
		
		data.entrySet().stream().filter(e -> e.getValue().equals(name))
								.map(k -> k.getKey())
								.forEach(k -> System.out.println(k));
	 */
		
//		data.forEach((k, v) -> System.out.println(k+" "+v));
//		data.entrySet().forEach((entry) -> System.out.println(entry.getKey()+"  "+entry.getValue()));
		
		
		System.out.println("Enter Name to print Id");
		Set<Integer> s = getEmployeeIdFromName(sc.next(), data);
		s.forEach(System.out::println);

	}

}
