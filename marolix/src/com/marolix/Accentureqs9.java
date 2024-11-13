package com.marolix;

import java.util.ArrayList;
import java.util.List;

public class Accentureqs9 {

		public static List<Integer> mergeArrays(int arr1[],int arr2[]){
		
		int i=0;
		int j=0;
		List<Integer> merged=new ArrayList<>();
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				merged.add(arr1[i]);
				i++;
			}else {
				merged.add(arr2[j]);
				j++;
			}
		}
			while(i<arr1.length) {
				merged.add(arr1[i]);
				i++;
			}
			while(j<arr2.length) {
				merged.add(arr2[j]);
				j++;
			}

		return merged;	
	
		
	}
		public static void main(String[] args) {
			int arr1[]= {1,3,5};
			int arr2[]= {2,4,6};
			List<Integer> re= mergeArrays(arr1,arr2);
	      
	     // for(int result:re) {
	      System.out.println(re);
	    //  }
	     
		}


}
