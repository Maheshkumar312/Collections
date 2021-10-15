package com.prodian.collectionExample.Iterator;

import java.util.ArrayList;
import java.util.List;

public class DifferentWayOfIterator {

	public static void main(String[] args) {
		List<String> prgmlang =new ArrayList<>();
		prgmlang.add("java");
		prgmlang.add("python");
		prgmlang.add(".net");
		prgmlang.add("springboot");
		
		 prgmlang.stream().forEach(prg -> System.err.println(prg));
		 
		 
		 prgmlang.forEach((prg) -> System.out.println(prg));

	}

}
