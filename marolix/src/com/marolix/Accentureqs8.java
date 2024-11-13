package com.marolix;

public class Accentureqs8 {

	public static void main(String[] args) {
		
		
		int arr[]={2,5,6,8,1};
		System.out.println(findMax(arr));
		
		

	}
	public static int findMax(int []arr) {
		
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int maxIndex=0;
		for(int num:arr) {
			if(num>first) {
				second=first;
			          first=num;
			
			}else
			if(num>second && num!=first) {
				second=num;
		}
		
		
		
	}
		return second;

	}
}
