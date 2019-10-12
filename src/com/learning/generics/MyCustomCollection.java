/**
 * 
 */
package com.learning.generics;

import java.util.ArrayList;

/**
 * @author Padigela Anil kumar
 *
 */
public class MyCustomCollection<T> {

	
	ArrayList<T> list = new ArrayList();
	
	public void addElement(T element) {
		list.add(element);
	}
	
	public void removeElement(T element) {
		list.remove(element);
	}

	@Override
	public String toString() {
		return "MyCustomCollection [list=" + list.toString() + "]";
	}
	
	
	
}
