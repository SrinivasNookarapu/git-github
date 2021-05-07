package com.training.collections.excersice;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class DuplicatesP4 {
	
	static List<Integer> getDuplicatesList(List<Integer> list){
		List<Integer> duplicates = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if(list.get(i) == list.get(j)) {
					count++;
				}
			}
			if(count > 0) {
				duplicates.add(list.get(i));
			}
			
		}
		Set<Integer> set = new HashSet<>(duplicates);
		duplicates = new ArrayList<>(set);
		return duplicates;
	}

	public static void main(String[] args) {
		System.out.println("enter Size Of The Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		System.out.println("Enter Elements to ArrayList");
		for (int i = 0; i < size ; i++) {
			list.add(sc.nextInt());
		}
		
		List<Integer> newList = getDuplicatesList(list);
		System.out.println("Duplicates Elements Are");
		for (Integer integer : newList) {
			System.out.println(integer);
		}

	}

}
