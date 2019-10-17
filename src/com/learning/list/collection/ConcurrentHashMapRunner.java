package com.learning.list.collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 */

/**
 * @author Padigela Anil kumar
 *
 */
public class ConcurrentHashMapRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> myMap = new ConcurrentHashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		myMap.put("6", "1");
		System.out.println("ConcurrentHashMap before iterator: "+myMap);
	//	Iterator<String> it = myMap.keySet().iterator();
		Set<String> s = myMap.keySet();
		for( String str : myMap.keySet()){
			
			if(str.equals("3")) myMap.put(str+"new", "new3");
		}
		System.out.println("ConcurrentHashMap after iterator: "+myMap);

		//HashMap
		
		myMap = new HashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		myMap.put("6", "1");
		System.out.println("HashMap before iterator: "+myMap);
		s = myMap.keySet();

for( String str : myMap.keySet()){
			
			if(str.equals("2")) myMap.put(str+"new", "new2");
		}
		System.out.println("HashMap after iterator: "+myMap);

	}

}
