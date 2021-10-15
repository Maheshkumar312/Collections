package com.prodian.collectionExample;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> collection =new ArrayList<>();
		collection.add("collection1");
		collection.add("collection2");
		collection.add("collection3");
		System.out.println(collection);
		 collection.remove("collection3");
		 System.out.println(collection);
		 
		 
		 collection.forEach((item) ->
		 {
			 System.out.println(item);
		 });
		 
		 collection.clear();
		 System.out.println(collection);
		 
	}

}
