package com.sorting.hashmap.byvalues;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class ByValues {
	
	public static void main(String [] args) {
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		hm.put(76,"Rahul");
		hm.put(34,"Sahil");
		hm.put(67,"Aahan");
		hm.put(56, "Janki");
		hm.put(89,"Ruhan");
		
		Set set =hm.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry map=(Map.Entry)iterator.next();
		}
		
	}

}
