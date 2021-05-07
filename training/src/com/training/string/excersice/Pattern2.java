package com.training.string.excersice;

public class Pattern2 {

	public static void main(String[] args) {
		int num = 1;
		String str = "";
		for (int i = 1; i <= 7; i++) {
			for (int j = i; j <= 6; j++) {
				str += num +" ";
			}
			for (int j = 1; j <= i; j++) {
				str += i +" ";
			}
			str += "\r";
		}
		System.out.println(str);



	}

}
