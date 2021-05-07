package com.training.collections.excersice;

import java.util.Arrays;
import java.util.Scanner;

public class NumberList {
    static String getNumberList(String list) {
        String str="";
        if(list == null) {
            return null;
        }
        String[] array = list.replaceAll("-", ",").split(",");
        int[] numbers = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            numbers[index] = Integer.parseInt(array[index]);
        }
        Arrays.sort(numbers);
        
        for (int i = numbers[0]; i <= numbers.length; i++) {
            str += i + ",";
        }
        return str.substring(0, str.length()-1);
    }
		public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter the number list: ");
		    String list = scanner.next(); 
		    System.out.println(getNumberList(list));
		}

 

}
