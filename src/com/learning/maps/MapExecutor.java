/**
 * 
 */
package com.learning.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Padigela Anil kumar
 *
 */
public class MapExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String >  hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "One");
		hashMap.put(2, "two");
		hashMap.put(3, "Three");
		hashMap.put(null, "five");

		Hashtable<Integer, String >  hashTable = new Hashtable<Integer, String>();
		hashTable.put(1, "One");
		hashTable.put(2, "two");
		hashTable.put(3, "Three");
	//	hashTable.put(null, "five"); hash table does not allow null keys
		
		
		TreeMap<Integer, String >  treeMap = new TreeMap<Integer, String>();
	
		treeMap.put(2, "two");
		treeMap.put(3, "Three");
		treeMap.put(1, "One");

		System.out.println(hashMap.get(1));
		
		Set<Entry<Integer, String >> elementSet = hashMap.entrySet();
		
		for(Entry<Integer, String > element : elementSet) {
			System.out.println("Id :"+element.getKey()+" Value :"+element.getValue());
		}
		
		Set<Integer> integerKeys = treeMap.keySet();
		System.out.println("Integer keys is "+treeMap.keySet());
		
		
		
	}

}
