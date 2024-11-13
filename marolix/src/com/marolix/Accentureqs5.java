package com.marolix;

public class Accentureqs5 {

	public static void main(String[] args) {
		int r=7;
		int unit=2;
		int n=8;
		int arr[]= {2,8,3,5,7,4,1,2};
		System.out.println(Calculate(r,unit,n,arr));

	}
    
	public static int Calculate(int r,int unit,int n,int arr[]) {
    	
    	int foodRequire=r*unit;
    	int food_store=0;
    	int house=0;
    	for(int i=0;i<n;i++) {
    		food_store=food_store+arr[i];
    		house++;
    		if(food_store>foodRequire) { 
    			
    		return house;
    		}
    	}
		return 0;
    	
  
    	
    }
}
