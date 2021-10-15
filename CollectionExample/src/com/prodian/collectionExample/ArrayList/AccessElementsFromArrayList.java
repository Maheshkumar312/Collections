package com.prodian.collectionExample.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {

	public static void main(String[] args) {
		List<String> prgmlang =new ArrayList<>();
		System.out.println("is this empty"+"  "+prgmlang.isEmpty());
		prgmlang.add("java");
		prgmlang.add("python");
		prgmlang.add(".net");
		prgmlang.add("springboot");

		System.out.println("size of prgmlang is"+" "+prgmlang.size());
		
		String bestprgmlang =prgmlang.get(0);
		System.out.println("best programming language is"+" "+bestprgmlang);
		
		prgmlang.set(1,"powerbi");
		System.out.println(prgmlang);
	}

}
