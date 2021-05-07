package com.training.collections.excersice;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListSortedP9 {
	
	private static List<Integer> sortIntList(List<Integer> data) {
		
		Set<Integer> set = new TreeSet<>(data);
		List<Integer> list = new ArrayList<>(set);
		
		return list;
		
	}

	public static void main(String[] args) {
		System.out.println("enter the Size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		List<Integer> data = new ArrayList<>();
		
		System.out.println("Enter Elemenets to List");
		for (int i = 0; i < size ; i++) {
			data.add(sc.nextInt());
		}
		
		System.out.println("By using Java 8 feature");
		data.stream().sorted().forEach(System.out::println);
		
		List<Integer> list = sortIntList(data);
		System.out.println("print list in assending order");
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

	

}
