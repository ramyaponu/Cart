package com.marolix;

import java.util.ArrayList;
import java.util.List;

public class Accentureqs2 {

	public static void main(String[] args) {
		
		
		int arr[]= {7,-5,5,4,-2,10,12};
		List<Integer> list=new ArrayList<>();
		int l=arr.length;
	//	int r=0;
		for(int i:arr) {
			
			if(i>=0) {
				list.add(i);
			
			}
			
		}
		int midindex=(list.size()-1)/2;
		System.out.println(list.get(midindex));	
	}

}
