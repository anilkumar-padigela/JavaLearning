/**
 * 
 */
package com.learning.generics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Padigela Anil kumar
 *
 */
public class GenericsRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyList<String> myListObj = new MyList<String>();
		
		myListObj.addElement("Ramu");
		myListObj.addElement("Rajesh");
		//myListObj.addElement(1);
		System.out.println(myListObj);
		
		
		MyList<Integer> myListIntObj = new MyList<Integer>();
		
		myListIntObj.addElement(1);
		myListIntObj.addElement(2);
		myListIntObj.addElement(3);
		
		System.out.println(myListIntObj);
		
		
	//	MyList<int> myListIntObj2 = new MyList<int>();  generics expect objects not primitive
		
		/*MyList<Dog> myListDogObj = new MyList<Dog>();
		MyList<Animal> myListDogObj1 = new MyList<Animal>();
	*/	
		
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Dog());
		
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog());
		dogList.add(new Dog());
		
		processAnimals(dogList);
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<Double> ld = Arrays.asList(1.0, 2.3, 3.5);
		List<String>  ls = Arrays.asList("one", "two", "three");
		printList(li);
		printList(ld);
	//	printList(ls);
	
	//	sumOfNumber(li);
		
		String name = returnSame(new String("Anil"));
		System.out.println("name is "+name);
		
		int  a = returnSame(new Integer(1));
		
		List<Dog> emptyList = new ArrayList<Dog>();
		emptyList.add(new Dog());
		addAnimals(emptyList);
		
	}
	//lower bound
	public static void addAnimals(List<? super GermanShepered> animalList) {
		//	Collection<?> e = new Animal();
		animalList.add(new GermanShepered());
		
		System.out.println("animal List"+animalList);
	//		animalList.add(d);
			//animalList.add(new Ger());
		}
	
	
	//upper bound
	public static void printList(List<? extends Number> list) {
		//list.add(1, 20);
	    for (Number elem : list)
	        System.out.println(elem + " ");
	    System.out.println();
	}
	
	
	public static void sumOfNumber(List<Number> list) {
		double sum = 0.0;
		for(Number n : list) {
			sum = sum + n.doubleValue();
		}
		
		System.out.println("Sum is "+ sum);
	}
	
	static <T> T returnSame(T param) {
		
		System.out.println("param value is "+param);
		return param;
	}
	
	public <T> T doSomething(T param) {
		
		return param;
	}
	
	public static void processAnimals(List<? extends Animal> animalList) {
	//	Collection<?> e = new Animal();
	//	animalList.add(new Animal());
	}

	
	//Diffrence between below two methods
	
	
	
	public static void printList1(List<?> list) {
	    for (Object elem: list)
	        System.out.print(elem + " ");
	    System.out.println();
	}
	
}
