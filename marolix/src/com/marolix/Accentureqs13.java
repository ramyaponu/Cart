package com.marolix;

public class Accentureqs13 {

	public static void main(String[] args) {
//		int num=232;
//		
//		int or=num;
//		int rev=0;
//		
//	int i=0;
//	while(num!=0) {
//		
//	
//			rev=rev*10+num%10;
//			num=num/10;
//	}
//if(or==rev) {
//	System.out.println("palin");
//}else {
//	System.out.println("not");
//}
		String s="welcome";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
