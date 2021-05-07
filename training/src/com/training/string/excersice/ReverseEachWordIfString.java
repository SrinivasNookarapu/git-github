package com.training.string.excersice;

import java.util.Scanner;

public class ReverseEachWordIfString {
	
	static String reverseString(String name) {
		String[] res = name.split(" ");
		String result = "";
		for (int i = 0; i < res.length; i++) {
			char[] ch = res[i].toCharArray();
			for (int j = ch.length - 1; j >= 0 ; j--) {			
					result += ch[j];					
			}
			result += " ";
		}		
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		
		System.out.println(reverseString(sc.nextLine()));

	}

}
