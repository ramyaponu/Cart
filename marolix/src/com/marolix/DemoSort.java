package com.marolix;

import java.util.List;
import java.util.Optional;

public class DemoSort {

	
	public static void main(String[] args) {
//		int arr[]= {2,3,4,1,5};//1,3,4,2,5    1,2,4,3,5  1,2,3,4,5
//		int swap=0;
//		int count =0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//				swap=arr[i];
//				arr[i]=arr[j];
//				arr[j]=swap;
//	
//				count++;
//			}
//			
//			}
//		
//		}
//	
//		System.out.println(count);	
		
		List<Integer> list=List.of(2,3,4,5,6);
		
		Optional<Integer> l=list.stream().map(i->i).reduce((a,b)->a+b);
		
		
		System.out.println(l);
		
		
		
	
	}

}	
	
	
	
	
	
	
	
	
	
	

