package com.training.mocktests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventList {
	
	

	
	static int[] getEvenArray(int[] arr){
		int length = arr.length;
		
	    int[] newArray = new int[length] ;
			int indexCopy = 0 ;	
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] % 2 == 0) {
					newArray[indexCopy] = arr[index];
				
				}
				
				indexCopy += 1;
			}
							
		return newArray;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the Size of the Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Array Elements : --");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		int[] copyArray = getEvenArray(arr);
		
		 
		if (copyArray != null) {
			System.out.print("Even Numbers in Given Array : ");
			 for (int index = 0; index < copyArray.length; index++) {
					if(copyArray[index] != 0 ) {
						System.out.print(copyArray[index]+" , ");
					}
				}
		}
		else {
			System.out.println("Size of Array must be 10 : "+copyArray);
		
		}

	}

}
