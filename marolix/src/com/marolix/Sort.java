package com.marolix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(StringDemo[] args) {
		
		Comparator<Integer> com=new Comparator<Integer>() {

			

			@Override
			public int compare(Integer o1, Integer o2) {
			if(o1%10>o2%10) 
				return 1;
			else 
				return -1;
			}

			

			
			
		};
		
		
		List<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(30);
		list.add(19);
		Collections.sort(list,com);
		System.out.println(list);
		
	}

}
