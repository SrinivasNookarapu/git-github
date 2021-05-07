package com.training.string.excersice;

public class Pattern5 {

	public static void main(String[] args) {
		
		String str = "";
		for (int i = 1; i <= 7; i++) {
			for (int j = 7; j >= i; j--) {
				str += j +" ";
			}
			str += "\r";
		}
		System.out.println(str);

	}

}
