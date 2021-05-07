package com.training.collections.excersice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItetarorDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("Srinu");
		al.add( "sai");
		al.add( "ramesh");
		
		ListIterator<String> listIt = al.listIterator();
		System.out.println("GForword Direction");
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		
		System.out.println("Reverse Direction");
		while(listIt.hasPrevious()) {
			System.out.println(listIt.previous());
		}
		
		
		
	

	}

}
