package com.training.string.excersice;

public class Pattern7 {

	public static void main(String[] args) {
		String str = "";
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				str += j +" ";
			}
			str += "\r";
		}
		
		System.out.println(str);
	}

}
