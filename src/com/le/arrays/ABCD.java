package com.le.arrays;

//How to play random songs b/w 1-10 and songs should not repeat.

public class ABCD{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		for(int i=0;i<1000;i++){
		suffle(0,5,arr);
			System.out.println("===");
	}
	}
	static void suffle(int low,int high,int[] arr){

		int ran = (int) (Math.random() * (high - low)) + low;
		int i=low;
			System.out.println(arr[ran]+"==="+ran);
			

			if(low==high){
			return;
			}

			int temp  =arr[ran];
			arr[ran]=arr[i];
			arr[i]=temp;


			suffle(low+1,high,arr);
			}
}