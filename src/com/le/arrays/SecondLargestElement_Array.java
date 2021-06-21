package com.le.arrays;

public class SecondLargestElement_Array {

	//Here naive appraoch can make it to n2 complexity
	//you have to do it in n complexity
	//We have to check if firstElement is updating itself than we have to put the previous value of it into the second largest
	//ie. arr[i]>firstLargest
	//if arr[i]==firstLargest we will ignore
	//if arr[i]<firstLargest than we to check if it is greater than the secondLargest.int[] a1= {12,12,12,7};
	public static void getSecondLargest(int []arr){
		int firstLargest=-1;
		int secondLargest=-1;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>firstLargest) {
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}
			else if(arr[i]<firstLargest && secondLargest<arr[i]) {
				secondLargest=arr[i];
			}
//			if(firstLargest!=arr[i] && arr[i]>secondLargest && secondLargest<firstLargest) {
//				secondLargest=firstLargest;
//			}
			
		}
		System.out.println("FirstLargest="+firstLargest+" , SecondLargest ="+secondLargest);
	}
	public static void main(String[] args) {
		int a[]= {10,20,30,40,9,3,2,60,23,32,27,60};//case 1
		int[] a1= {12,12,12,7};//case 2
		getSecondLargest(a);
		getSecondLargest(a1);
	}
	//O(n)
}
