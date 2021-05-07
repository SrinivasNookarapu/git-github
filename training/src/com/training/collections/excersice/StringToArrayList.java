package com.training.collections.excersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringToArrayList {

	public static void main(String[] args) {
		String[] str = {"srinu", "vasu", "ram"};
		ArrayList<String> al = new ArrayList<>();
		
		Collections.addAll(al, str);
		al.forEach(System.out::println);
		
		System.out.println("convert list to array");
		Object b[] = al.toArray();
		for (Object object : b) {
			System.out.println(object);
		}
		
		
		//Another method
		System.out.println("Another method for array to list");
		String[] str1 = {"srinu", "vasu", "ram"};
		ArrayList<String> al1 = new ArrayList<>(Arrays.asList(str1));
		al1.add("phani");
		Collections.sort(al1);
		al1.forEach(System.out::println);
		
		//convert non-syn to syn
		
		Collections.synchronizedList(al1);
		al1.forEach(System.out::println);
		
		
		


	}

}
