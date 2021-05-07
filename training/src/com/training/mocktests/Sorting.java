package com.training.mocktests;

public class Sorting {
	
	public int[] sorting(int[] arr) {
		
		int temp, j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while(j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j -1;
			}
			arr[j] = temp;
					
		}
				
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
