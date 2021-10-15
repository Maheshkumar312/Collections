package com.prodian.collectionExample.Iterator;

import java.util.ArrayList;
import java.util.*;

public class ListIterator {

	public static void main(String[] args) {
		List<String> prgmlang =new ArrayList<>();
		prgmlang.add("java");
		prgmlang.add("python");
		prgmlang.add(".net");
		prgmlang.add("springboot");
		
		
		java.util.ListIterator<String> listIterator =  prgmlang.listIterator();
		System.out.println("forward direction");
		
		
		while (listIterator.hasNext()) {
			String element =listIterator.next();
			System.out.println(element);
		}
			
			System.out.println("backword");

			while (listIterator.hasPrevious()) {
				String eleme =listIterator.previous();
				System.out.println(eleme);
				
			
		}
	}
}