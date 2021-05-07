package com.training.string.excersice;

public class Pattern8 {

	public static void main(String[] args) {
		String str = "";
		
//		String temp = "srinu";
//		StringBuffer sb = new StringBuffer(temp);
//		System.out.println(sb.reverse().substring(1));
		
		
		for (int i = 1; i <= 7; i++) {
			String temp = "";
			for (int j = 1; j <= i; j++) {
				temp += j +"";
				str += j +"";
			}
			
			if(i > 1) {
				StringBuffer sb = new StringBuffer(temp);
				str += sb.reverse().substring(1).toString();
				
			}
			str += "\r";
		}
		
		System.out.println(str);



	}

}
