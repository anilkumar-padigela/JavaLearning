/**
 * 
 */
package com.learning.Kundana_Practise;

import java.util.*;

/**
 * @author Padigela Anil kumar
 *
 */
public class GenericsMyList <K>{
public List<K> myList = new ArrayList<K>();
public void addelement(K value) {
	myList.add(value);
	
	
}

public void removeelement(K value) {
	myList.remove(value);
	
	
}

@Override
public String toString() {
	return "GenericsMyList [myList=" + myList + "]";
}	

	
}
