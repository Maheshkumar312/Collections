package com.prodian.collectionExample.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CopyOnWriteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =new java.util.concurrent.CopyOnWriteArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
 
		Iterator<String> iterator =list.iterator();
		while(iterator.hasNext())
		{
			String str =iterator.next();
			System.out.println(str);
			if(str.equals("one"))
			{
				list.remove("one");
			}
			if(str.equals("three"))
			{
				list.add("four");
			}
			System.out.println(list);
		}
	}

}
