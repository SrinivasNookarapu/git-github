package com.training.collections.excersice;

import java.util.*;

class MyCom implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}

public class TreeSetDemoDesc {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>(new MyCom());
		set.add("srinu");
		set.add("vasu");
		set.add("ram");
		set.add("anu");
		set.forEach(System.out::println);

	}

}
