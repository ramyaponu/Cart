package com.marolix;

public class TwodArrays {

	public static void main(String[] args) {
		          
	
	//int arr[][]=new int [3][3];
		int [][]arr={{0,3,4}
		             ,{6,7,8}
                     ,{9,4,2}}; 
		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				int temp=arr[i][j];
//				arr[i][j]=arr[j][i];
//				arr[j][i]=temp;
//				System.out.print(arr[i][j]);
//				System.out.print(arr[j][i]);
//			}
//			
//		}
		
		
		
		for(int j=0;j<3;j++) {
			for(int i=3-1;i>=0;i--) 
				System.out.print(arr[i][j]+" ");
				System.out.println();
	
		}
	}

}
