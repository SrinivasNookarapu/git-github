package com.training.string.excersice;

import java.util.Scanner;

public class AnagramString {
	
	static boolean displayAnagramWords(String str1, String str2) {
		boolean b = false;
		char[] ch = str1.toLowerCase().toCharArray();
		char[] ch1 = str2.toLowerCase().toCharArray();
		int length = ch.length;
		int length1 = ch1.length;
		int count = 0;
		if(length == length1) {
			for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch1.length; j++) {
					if(ch[i] == ch1[j]) {
						count++;
						ch1[j] = '%';
						break;
					}
				}
			}
			
		}
		
		if(count == length) {
			b = true;
		}
		return b;
	}

	public static void main(String[] args) {
		System.out.println("Enter Two Strings ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Is Given Two Strings are AnagramWords ? "+displayAnagramWords(sc.next(), sc.next()));
	}

}
