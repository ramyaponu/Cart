package com.marolix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Accentureqs4 {

	public static void main(String[] args) {
		
		String s="aaaaa";
		int k=3;
		songCount(s,k);
	}

	static int songCount(String s,int k) {
		
		int i=0;
		int j=0;
		int currentCount=0;
		int maxCount=0;
		
		while(j<k){
		
			if(s.charAt(j)=='a'){
				currentCount++;
			}
			j++;
		}
	//	maxCount=max(maxCount,currentCount);
		while(j<s.length()) {
			if(s.charAt(i)=='a')currentCount--;
			if(s.charAt(j)=='a')currentCount++;
	//		maxCount=max(maxCount,currentCount);
			i++;
			j++;
			}

		return maxCount;
		
	}

	
}
