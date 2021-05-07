package com.training.string.excersice;

public class Pattern3 {

	public static void main(String[] args) {

		String str = "";
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				str += j +" ";
			}
			str += "\r";
		}
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				str += j +" ";
			}
			str += "\r";
		}
		
		
		System.out.println(str);

	}

}
