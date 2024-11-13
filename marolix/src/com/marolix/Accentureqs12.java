package com.marolix;

import java.util.Arrays;

public class Accentureqs12 {

	public static void main(String[] args) {
		
//		String s1="listen";
//		String s2="silent";
//		
//		char[] s11=s1.toCharArray();
//		char[]s22=s2.toCharArray();
//		Arrays.sort(s11);
//		Arrays.sort(s22);
//		
//		if(Arrays.equals(s11, s22)){
//			System.out.println(true);
//		}else {
//		
//		System.out.println(false);
//
//	}
		int []ar= {1,2,3,5};
		
		int sum1=0;
		int sum2=0;
		int n=0;
	for(int i=0;i<ar.length;i++) {
		sum1=sum1+ar[i];
	}
	for(int i=0;i<=5;i++) {
		sum2=sum2+i;
	}
	n=sum2-sum1;
		
	System.out.println(n);	
		
		
	}
}
