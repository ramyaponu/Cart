package com.marolix;

public class Accentureqs10 {

	public static void main(String[] args) {
		
		String s="dade";
		String original=s;
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
			System.out.println(reverse);
		}
     if(original.equals(reverse)) {
    	 System.out.println("palindrome");
     }else {
     System.out.println("not");
	
     }
     }

}
