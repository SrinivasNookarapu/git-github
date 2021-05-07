package com.training.collections.excersice;

import java.util.*;

class Book{
	String name;
	double price;
	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("Andhra", "Amaravathi");
		ht.put("Telangana", "Hyd");
		ht.put("Maharastra", "Mumbai");
		ht.put("Karnataka", "Bangalore");
		ht.put("Tamilnadu", "Chennai");
		ht.put("Sikkim", "Gangtok");
		ht.put("Nagaland", "Kohima");
		
		Enumeration<String> keys = ht.keys();
		while(keys.hasMoreElements()) {
			String k = keys.nextElement();
			String v = ht.get(k);
			System.out.println(k+" - "+v);
		}

	}

}
