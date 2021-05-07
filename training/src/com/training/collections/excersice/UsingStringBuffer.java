package com.training.collections.excersice;

import java.util.Comparator;
import java.util.TreeSet;

class MyCom1 implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}
	
}

public class UsingStringBuffer {
	
	public static void main(String[] args) {
		
		TreeSet<StringBuffer> set = new TreeSet<StringBuffer>(new MyCom1());
		set.add(new StringBuffer("srinu"));
		set.add(new StringBuffer("vasu"));
		set.add(new StringBuffer("ramesh"));
		set.add(new StringBuffer("harish"));
		set.forEach(System.out::println);

	}

}
