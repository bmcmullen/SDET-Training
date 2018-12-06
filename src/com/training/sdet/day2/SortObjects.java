package com.training.sdet.day2;

import java.util.Arrays;

public class SortObjects {
	public static void main(String[] args) {
		int [] arr = {400, 35, 12, 5, 76, 32};
		
		System.out.print("Before: ");		
		for (int temp: arr) {
			System.out.print(temp + "	");
		}
		
		Arrays.sort(arr);

		System.out.print("\nSorted: ");
		for (int temp: arr) {
			System.out.print(temp + "	");
		}

	}

}
