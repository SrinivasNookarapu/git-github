package com.training.collections.excersice;
import java.util.*;

class MyComp implements Comparator{
//
//	public int compare(Object o1, Object o2) {
//		String s1 = (String)o1;
//		String s2 = (String)o2;
//		return s2.compareTo(s1);
//	}
	
	public int compare(Object o1, Object o2) {
		Integer s1 = (Integer)o1;
		Integer s2 = (Integer)o2;
		return s2.compareTo(s1);
	}
	
}
public class ReverseOrderDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>(new MyComp());
		map.put(6, "srinu");
		map.put(3, "vasu");
		map.put(5, "ramesh");
		System.out.println(map);
		
		Map<String, Integer> map1 = new TreeMap<>();
		map1.put("srinu", 6);
		map1.put("vasu", 3);
		map1.put("ramesh", 5);
		System.out.println(map1);
		
		
		Integer[] arr = {1,2,1,2};
		
		HashSet<Integer> s = new HashSet(Arrays.asList(arr));
		System.out.println(s);
		Integer[] arr1 = new Integer[s.size()];
		s.toArray(arr1);
		for (Integer integer : arr1) {
			System.out.println(integer);
		}
		

	}

}
