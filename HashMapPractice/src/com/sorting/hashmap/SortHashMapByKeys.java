package com.sorting.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;


public class SortHashMapByKeys {

	public static void main(String []args) {
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		hm.put(23,"Anil");
		hm.put(13,"Sunil");
		hm.put(14,"Pravin");
		hm.put(10,"Navin");
		
		Iterator<Integer> it= hm.keySet().iterator();
		System.out.println("Before Sorting");
		while(it.hasNext()) {
			int wh=(int)it.next();
			System.out.println("Roll no: "+wh+ " Name: "+hm.get(wh));

		}
		Map<Integer,String> map=new HashMap<Integer,String>();
		System.out.println("After sorting");
		TreeMap<Integer, String> treemap=new TreeMap<Integer,String>(hm);

		Iterator<Integer> itr=treemap.keySet().iterator();
		
		while(itr.hasNext()) {
			int whi=(int) itr.next();
			System.out.println("Roll no: " +whi+ "Name: "+hm.get(whi));
		}
		
	}
}
