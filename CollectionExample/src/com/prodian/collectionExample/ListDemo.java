package com.prodian.collectionExample;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("list1");
		list.add("list1");
		list.add("list2");
		list.add("list2");
		System.out.println(list);
		
		
	list.add(null);
	System.out.println(list);
	
	
	System.out.println(list.get(0));
	System.out.println(list.get(2));
	}
	

}
