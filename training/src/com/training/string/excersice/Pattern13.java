package com.training.string.excersice;

public class Pattern13 {

	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if(j == 1) {
					str += i +" ";
				}
				else {
					str += (i+4) +" ";
				}
				
			}
			str += "\r";
		}
		
		System.out.println(str);

	}

}
