package com.marolix;

public class Assentureqs11 {

	public static void main(String[] args) {
		char ch1='a';
		char ch2='p';
		String s="apple";
		replace(s,ch1,ch2);
	}
	public static String replace(String s,char ch1,char ch2) {
		
		String str="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch1) {
			 str+=ch2;
			}else if 
			(s.charAt(i)==ch2) {
			 str+=ch1;
			}else {
				str+=s.charAt(i);
			}
			}
		
System.out.println(str);
return str;
	}

}
