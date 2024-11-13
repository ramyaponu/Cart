package com.Leetcode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class NonReapetedCharacter {

	public static void main(String[] args) {
		String s="pwwkew";
	nonRepatedString(s);	
	}
	public static int nonRepatedString(String s) {
		Set<Character> ss=new HashSet<>();
		char[] ch=s.toCharArray();
	for(char c: ch) {
		
		if(!ss.contains(c)) {
			ss.add(c);
		}
	}
		
		int leng=ss.size();
		System.out.println(leng);
	
//	for(int i=0;i<=ch.length;i++) {
//	for()	
//	
//		if(ch==)
//		
//		
//	}
		
		
		
		
		
		return leng;
		
	}
}
