package com.le.main;

import java.util.HashSet;
import java.util.Set;

public class Sol1 {

	public static boolean findArrayHasElementWhichSumIsGiven(int given_arr[],int result_sum){
		Set<Integer> requiredDigits = new HashSet<>();
		for (int i = 0 ; i < given_arr.length ; i++) {
			if(requiredDigits.contains(given_arr[i])) {
				return true;
			}
			requiredDigits.add(result_sum-given_arr[i]);
			
		}
		return false;
	}
	public static void main(String[] args) {
		
		int arr[]= {10, 15, 3, 7};
		 boolean result=findArrayHasElementWhichSumIsGiven(arr, 17);
		 System.out.println(result);
	}
}
