package com.training.string.excersice;

import java.util.Scanner;

//  Write a program   to count duplicate characters from a string?

public class DuplicateCharacterInString {
	
	public static String findDuplicate(String name) {
		String str = "";
		char[] ch = name.toLowerCase().toCharArray();
		char[] ch1 = name.toLowerCase().toCharArray();
		
		int count;
		
		for (int i = 0; i < ch.length; i++) {
			count = 0;
			for (int j = 0; j < ch.length; j++) {
				if(ch[i] == ch1[j]) {
					count++;
				}
			}
			if(count > 1) {
				str += "Character of Duplicates are : " +ch[i]+"\r";
			}
		}
		return str;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(findDuplicate(name));

	}

}
