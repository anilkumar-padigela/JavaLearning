/**
 * 
 */
package com.learning.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Padigela Anil kumar
 *
 */
public class GenericsExecutor {

	public static void main(String[] args) {
		MyCustomCollection<String> collection = new MyCustomCollection();

		collection.addElement("Ramu");
		collection.addElement("Rajesh");

		System.out.println(collection);

		MyCustomCollection<Integer> intCollection = new MyCustomCollection();

		intCollection.addElement(Integer.valueOf(1));
		intCollection.addElement(Integer.valueOf(2));
		System.out.println(intCollection);

		returnSame(new Integer(1));
		returnSame(new String("Ramu"));
		returnSame(new ArrayList());

		doSomething(new Integer(1));
		doSomething(new String("Ramu"));
		doSomething(new ArrayList());

		// duplicate(new Integer(1))
		
		List<Integer> emptyList = new ArrayList<Integer>();
	//	addCoupleOfValues(emptyList);
		System.out.println(emptyList);
	}

	static <T> T returnSame(T value) {

		return value;
	}

	static <T extends List> T duplicate(T list) {

		list.addAll(list);
		return list;

	}

	static <T extends List> void duplicateList(T list) {

		list.addAll(list);
		// return list;

	}
	//wild cards on method arguments
	//upper bounded wild card : helps in implementing common logic. What all the methods available in the Numbers class is available
	//to the elements
	static Number sumOfList(List<? extends Number> numbers) {
		double sum = 0.0;
		//numbers.add(1);
		for(Number num : numbers) {
			sum = sum + num.doubleValue();
		}
		
		return sum;
	}

	
	//lower bounded wild card; elements adding into this list are extedning Numbers
		static void addCoupleOfValues(List<? super Number> numbers) {		
			double sum = 0.0;
			numbers.add(1);
			numbers.add(1.0);
		}
		
		//This is a unbounded  generics .. it can accept anything
		static <X> X doSomething(X value) {
			
			return value;
		}
}
