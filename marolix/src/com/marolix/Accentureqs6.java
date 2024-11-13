package com.marolix;

import java.util.Arrays;

public class Accentureqs6 {

	public static void main(String[] args) {
		int arr[]= {3,2,1,6,5,4};
		int k=2;
		System.out.println(findSMax(arr,k));
	}
//	public static int findSMax(int arr[],int k) {
//		for(int i=0;i<k;i++) {
//			
//		
//		int maxIndex=i;
//		
//		
//			for(int j=i+1;j<arr.length;j++) {
//			if(arr[j]>arr[maxIndex]) {
//				maxIndex=j;
//				
//			}
//			
//		}
//			int temp=arr[i];
//		
//			arr[i]=arr[maxIndex];
//		
//
//			arr[maxIndex]=temp;
//		
//		}
//		return arr[k-1];
//}

	public static int findSMax(int arr[],int k){
		
		
		int n=arr.length;
		Arrays.sort(arr);
		return arr[n-k];
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
