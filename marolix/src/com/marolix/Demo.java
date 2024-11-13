package com.marolix;

import java.util.Arrays;

public class Demo {

	public static void main(StringDemo[] args) {
		String s1="tools";
		String s2="stoo";
		if(s1.length()==s2.length()) {

	      char[] ch1=s1.toCharArray();
	      char[]ch2=s2.toCharArray();
	      Arrays.sort(ch1);
	      Arrays.sort(ch2);
	      boolean result=Arrays.equals(ch1,ch2);
	      if (result) 
	    	  System.out.println("anagram");
	      else 
	    	  System.out.println("not");
	      
	    	  
		}else {
		System.out.println("not");

}

	}	
}