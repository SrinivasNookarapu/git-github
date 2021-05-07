package com.training.mocktests;

import java.util.Scanner;

public class StrongNum {
		static boolean checkPerfectNum(int number) {
			int sum = 0, temp = number, rem = 0;
			boolean b = false;
			while( number != 0 ) {
				int fact = 1;
				rem = number % 10 ;
				while(rem != 0) {
					fact = fact * rem;
					rem--;
				}
				sum = sum + fact;
				number = number / 10;
			}
			if (temp == sum) {
				b = true;
			}
			return b;
		}

		public static void main(String[] args) {
			System.out.println("Enter Input Number");
			Scanner sc = new Scanner(System.in);			
			int number = sc.nextInt();
			System.out.println("Is PerFect Num : "+checkPerfectNum(number));
		}

	}



