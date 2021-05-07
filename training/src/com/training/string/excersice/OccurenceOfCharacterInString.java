package com.training.string.excersice;

import java.util.Scanner;

//  Write a program  to count Occurrences Of Each Character In String :

public class OccurenceOfCharacterInString {
	
	public static String findOccurence(String name) {
		String str = "";
		char[] ch = name.toCharArray();
		char[] ch1 = name.toCharArray();
		
		int count;
		
		for (int i = 0; i < ch.length; i++) {
			count = 0;
			for (int j = 0; j < ch.length; j++) {
				if(ch[i] == ch1[j]) {
					ch1[j] = '%';
					count++;
				}
			}
			if(count > 0) {
				str += "Character of : " +ch[i]+" "+count +"\r";
			}
		}
		
		
		return str;
	}
	

	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(findOccurence(name));

	}

	

}
