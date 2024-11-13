package com.marolix;

import java.util.HashMap;
import java.util.stream.IntStream;

public class Duplicate {

	public static void main(String[] args) {
		
		
		
			
		String s="applephone";
     char[] words=s.toCharArray();
         for(Character ch:words) {
        	 
         
		HashMap<Character,Integer> hs=new HashMap<>(ch);
		if(hs.containsKey(ch)) {
			hs.put(ch, hs.get(words)+1);
		}else {
			hs.put(ch, 1);
		}
		System.out.println(hs); 	
		
	}
      

}
}