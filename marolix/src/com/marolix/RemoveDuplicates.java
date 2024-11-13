package com.marolix;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

//remove duplicates from sorted array ll 80
public class RemoveDuplicates {

	public static void main(String[] args) {
		int nums[]= {1,1,1,2,2,3,3,3};
		System.out.println(removeDuplicates(nums));

	}
//	 public static int removeDuplicates(int[] nums) {
//	        Map<Integer,Integer> map=new HashMap<>();
//	 int res=0;
//	for(int i=0;i<nums.length;i++){
//	if(map.containsKey(nums[i])){
//	map.put(nums[i],map.get(nums[i])+1);
//
//	}else{
//	    map.put(nums[i],1);
//	}
//	
//	}
	// Set<Entry<Integer,Integer>>e=map.entrySet();
//	map.entrySet().stream().distinct().collect(Collectors.toList());
//	
//	for(Entry<Integer, Integer> m:map.entrySet()) {
//		 
//		 if(m.getValue()==3) {
//			 
//			 System.out.println(m);
//			 
//		 }
//	 }
	 
	 
	
//	    return res;     
//	    }
//	  public int removeDuplicates(int[] nums) 
//	    {
//	        int n=nums.length;
//	        int k=2;
//	        for(int i=2;i<n;i++)
//	        {
//	            if(nums[i]!=nums[k-2])
//	            {
//	                nums[k]=nums[i];
//	                k++;
//	            }
//	        } 
//	        return k;          
//	    }
	  public static int removeDuplicates(int[] nums) {
	        int n = nums.length;
	        if(n<=2){
	            return n;
	        }

	        int j = 2;
	        for(int i=2; i<n; i++){
	            if(nums[i] != nums[j-2]){
	                nums[j] = nums[i];
	                j++;
	            }
	        }
	        return j;
	    }
}
