package com.training.collections.excersice;

import java.util.*;
import java.util.Map.Entry;

class MyComp1 implements Comparator{
	
	public int compare(Object o1, Object o2) {
		Integer s1 = (Integer)o1;
		Integer s2 = (Integer)o2;
		return s2.compareTo(s1);
	}
	
}

public class OrderedMapP12 {
	
	static Map<Integer, String> addElement(int[] elements, String[] names){
		Map<Integer, String> map = new TreeMap<Integer, String>(new MyComp1());
		for (int i = 0; i < names.length; i++) {
			map.put(elements[i], names[i]);
		}
		 
		return map;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Int nad String Array");
		int size = sc.nextInt();
		int[] elements = new int[size];
		System.out.println("Enter integer Elements");
		for (int i = 0; i < elements.length; i++) {
			elements[i] = sc.nextInt();
		}
		
		System.out.println("Enter String names");
		String[] names = new String[size];
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}
		
		Map<Integer, String> map = addElement(elements, names);
		System.out.println("print the data in sorting order");
		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
