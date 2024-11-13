package com.marolix;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class StringDemo {

	public static void main(String[] args) {
		
          String s="babcbb";
         System.out.println(unique(s));

	}
	public static int unique(String s) {
		
	Set<Character> st=new HashSet<Character>();
	for(int i=0;i<s.length();i++) {
	st.add(s.charAt(i));
	System.out.println(st);
	
	}
	return st.size();
	}
}


//int result=0;
//boolean c=false;
//for(int i=0;i< s.length();i++){
//	c=true;
//  for(int j=0;j< s.length();j++){
//
//   
//     if(i != j &&  s.charAt(0)== s.charAt(1)){
// 
//       c=false;
//
//        
//     }  
//     
//
//    }
//  if(c) {
//	  
//  
//  char st=s.charAt(i);
//  System.out.println(st);
//  break;
//  }
//}