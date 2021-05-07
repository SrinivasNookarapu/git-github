package com.training.string.excersice;

import java.util.Scanner;

public class Demoss {
	
	private static String displayVowels(String next) {
		String res = "";
		next = next.toLowerCase();
		for (int i = 0; i < next.length(); i++) {
			if(next.charAt(i) == 'a' || next.charAt(i) == 'e' || next.charAt(i) == 'i' || next.charAt(i) == 'o' || next.charAt(i) == 'o' ) {
				res += next.charAt(i);
			}
			
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		System.out.println("Vowels in givenname : " + displayVowels(sc.next()));
	}

	
		
}
