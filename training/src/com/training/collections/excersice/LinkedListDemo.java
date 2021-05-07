package com.training.collections.excersice;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println("All " +list);
		list.removeFirst();
		list.removeLast();
		System.out.println("  After first and last " +list);
		
		LinkedList<String> clone = (LinkedList<String>) list.clone();
		System.out.println("Clone method " +clone);
		

	}

}
