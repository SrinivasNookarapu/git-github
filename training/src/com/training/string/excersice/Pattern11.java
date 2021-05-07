package com.training.string.excersice;

public class Pattern11 {

	public static void main(String[] args) {

         String str = "";
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				
				if(j % 2 == 0) {
					str += "0 ";
				}
				else {
					str += "1 ";
				}				
				
			}
			str += "\r";
		}
		
		System.out.println(str);

	}

}
