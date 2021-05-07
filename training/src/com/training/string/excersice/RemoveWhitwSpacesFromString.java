package com.training.string.excersice;

import java.util.Scanner;

public class RemoveWhitwSpacesFromString {
	
	public static String removeWhiteSpaces(String nextLine) {
		String str ="";
		String[] input = nextLine.split(" ");
		for (int i = 0; i < input.length; i++) {
			str += input[i];
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);		
		System.out.println(removeWhiteSpaces(sc.nextLine()));

	}

	

}
