package com.map.iterate;


//Set set = map.entrySet();
//	Iterator itr=set.iterator();
//while(itr.hasNext());
//{
//	Map.Entry entry = (Map.Entry)itr.next();
//	System.out.print(entry.getKey()+" "+entry.getValue());
import java.util.*;  
public class MapExample {  
public static void main(String[] args) { 
	
    Map map=new HashMap();  
      
    map.put(1,"Ashish");  
    map.put(5,"krushna");  
    map.put(2,"rahul");  
    map.put(6,"Amit");   		

    Set set = map.entrySet();
    Iterator itr = set.iterator();

    while(itr.hasNext()) {
    	Map.Entry entry = (Map.Entry)itr.next();
    	System.out.print(entry.getKey()+" "+entry.getValue());
    			
    			
    		
    
    
    }  
}  
}  


