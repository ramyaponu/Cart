package com.marolix;

public class Practice{

	public static void main(String[] args) {
		int space=0;
		int n=4;
//		for(int i=1;i<=n;i++) {
//			
//			
//			for(int s=1;s<=n-i;s++) { 
//				System.out.print(" ");
//			}	
//			for(int j=1;j<=i*2-1;j++) {
//	        	System.out.print("*");
//			
//				
//			}
//			System.out.println();
	
//			
//		}
		
           for(int i=0;i<=n;i++) {
		
			for(int j=0;j<=n-i-1;j++) {
	        	System.out.print(" ");
			}
	        	for(int s=0;s<=i;s++) { 
					System.out.print("* ");
				}	
				
			System.out.println();	
			
		}
for(int i=0;i<=n-1;i++) {
	
	
	for(int j=0;j<=i;j++) {
    	System.out.print(" ");
	}
    	for(int s=0;s<=n-i-1;s++) { 
			System.out.print("* ");
		}	
		
	System.out.println();	
	
}

	
//	     for(int i=1;i<=n;i++) {
//		for(int j=i;j<=n;j++) 
//			System.out.print("*");
//			
//		
//		for(int j=1;j<i;j++) 
//        	System.out.print(" ");	
			
		
//		for(int j=1;j<i;j++) 
//        	System.out.print(" ");	
//			
//		for(int j=i;j<=n;j++) 
//			System.out.print("*");
			
			
		
//	}
	}
}


