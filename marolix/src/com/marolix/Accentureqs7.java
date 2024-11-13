package com.marolix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Accentureqs7{

	 

	public static void main(String[] args) {
//		int sum=0;
//		int n=5;
//		int a[]= {2,3,4};
//		for(int i=1;i<=a.length;i++) {
//			if(i%2==0) {
//		System.out.print("Even");
//							}
//			else {
//				System.out.print("Odd");
//			}
//			
//		}
		
   List<Integer> list1=Arrays.asList(2,6,5);
   List<Integer> list2=Arrays.asList(3,4,8);
   List<Integer> list3=new ArrayList<>();
         int res=0;
         int re=0;
   for(int i=0;i<list1.size();i++) {
	 for(int j=0;j<list2.size();j++) {
		    if(list1.get(i)>0 && list2.get(j)>0) {
		    	  
		     res=list1.get(0)+list2.get(0);
		     re=list1.get(1)+list2.get(1);
		     list3.add(res);
		     list3.add(re);
		     
		    }
		    
		 
	 }
	 
   }
  
   System.out.println(list3);		
		
		
	}

}
