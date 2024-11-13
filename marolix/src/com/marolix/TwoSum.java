package com.marolix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
//leetcode 1
	public static void main(String[] args) {
		int[] nums= {2,7,11,17};
		int target=9;
		System.out.println(add(nums,target));
	}

	public static  int[] add(int []nums,int target){
		
		int[] arr=new int[4];
		int result=0;
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
			if(nums[i]+nums[j]==target) {
				
		return new int [] {i,j};
		
			}
		
			}
		
		}
		
	
		return new int [] {} ;
		
	}
	
	
	
	
	
	
	
}
