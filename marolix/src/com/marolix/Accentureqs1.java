package com.marolix;

public class Accentureqs1 {

	public static void main(String[] args) {
		
		int a=3,b=5,c=1,d=4;
		negitiveNum(a,b,c,d);
	}
	public static void negitiveNum(int a,int b,int c,int d) {
		
		int ar[]= {a,b,c,d};
		int sum=0;
		for(int i:ar) {
			
			if(i<=0) {
				sum=sum+i;
				
			}
			
		}
		System.out.println(sum);
		
	

	}

}
