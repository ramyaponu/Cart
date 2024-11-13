package com.marolix;

import java.util.ArrayList;
import java.util.List;

public class Leetcode {

	public static void main(String[] args) {
		
		int ar1[]= {1,2};
		int ar2[]= {3,4};
		
		int i=0;
		int j=0;
		int res=0;
		List<Integer> merged=new ArrayList<>();
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]<ar2[j]) {
				merged.add(ar1[i]);
				i++;
			}else {
				merged.add(ar2[j]);
				j++;
			}
		}
			while(i<ar1.length) {
				merged.add(ar1[i]);
				i++;
			}
			while(i<ar2.length) {
				merged.add(ar2[j]);
				j++;
			}
		System.out.println(merged);
//		int n=merged.size();
//		if(n%2==0) {
//		 res=merged.get(1)+merged.get(2)/2;	
//		
//		
//		 System.out.println(res);
//		}else {
//			System.out.println(merged.get(1));
//		}
		
		}	
	}
		
		
		
	

