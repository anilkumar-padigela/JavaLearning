/**
 * 
 */
package com.learning.generics2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Padigela Anil kumar
 *
 */
public class MyList<T> {
	
	private List<T> myValue = new ArrayList<T>();
	
	public void addElement(T  value) {
		
		myValue.add(value);
	}
	
	public void removeElement(T value) {
		
		myValue.remove(value);
	}

	@Override
	public String toString() {
		return "MyList [myValue=" + myValue + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	

}
