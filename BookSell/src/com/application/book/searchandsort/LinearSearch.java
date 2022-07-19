package com.application.book.searchandsort;

public class LinearSearch {

	public static int linearSearch(int arr[], int x) {
		int n = arr.length;
		
		for(int i = 0; i<n; i++) {
			if(arr[i] == x)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 3,4, 67, 89, 5};
		int x = 67;
		System.out.println("the index of " + x + " is " + linearSearch(arr, x));
	}
}
