package com.mypractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4);
        List<Integer> l=list.stream().map(n->n+5).collect(Collectors.toList());
        System.out.println(l);
		List<Integer>i=list.stream().filter(n->n%2==0).map(n->n).collect(Collectors.toList());
		System.out.println(i);
		
		
		
	}

}
