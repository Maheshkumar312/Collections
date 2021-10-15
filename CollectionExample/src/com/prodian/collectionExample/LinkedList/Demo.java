package com.prodian.collectionExample.LinkedList;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		LinkedList<String> linkedList =new LinkedList<>();
		linkedList.add("one");
		linkedList.add("two");
		linkedList.add("three");
		linkedList.add("four");
		System.out.println(linkedList);
		
		linkedList.add(1,"five");
		System.out.println(linkedList);
		
		
	linkedList.addFirst("hii");
	System.err.println(linkedList);
		linkedList.addLast("hello");
		System.out.println(linkedList);
		
		String first=linkedList.getFirst();
		System.out.println(first);
		String last=linkedList.getLast();
		System.out.println(last);
		String getele=linkedList.get(3);
		System.out.println(getele);
		
		for(String item:linkedList)
		{
			System.out.println(item);
		}
		int index =linkedList.indexOf("one");
		System.out.println(index);
	}
	

}
