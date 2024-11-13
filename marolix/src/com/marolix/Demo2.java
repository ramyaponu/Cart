package com.marolix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {
	int missingNumber(List <Integer> arr,int n) {
		int sum=0;
		
//		for(Integer nums :arr) {
//			sum=sum+nums;
//		}
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext()) {
		sum=sum+it.next();	
		}
		int sum2=n*(n+1)/2;
		int diff=sum2-sum;
		return diff;
		
	}

	public static void main(StringDemo[] args) {
		Demo2 demo=new Demo2();
		List<Integer> arr= List.of(1,4,3,5);
		
		
		System.out.println(demo.missingNumber(arr,5));
		
		
	}

}
