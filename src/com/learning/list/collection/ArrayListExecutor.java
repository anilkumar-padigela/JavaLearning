/**
 * 
 */
package com.learning.list.collection;

import java.util.*;


/**
 * @author Padigela Anil kumar
 *
 */
public class ArrayListExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List myList = new ArrayList();
		
		myList.add("Blue");
		myList.add(0, "Yellow");
		myList.add("Red");
	//	myList.add(1);
	//	System.out.println(myList);
		//HomogenousList
		List<String> myList1 = new ArrayList();
		myList1.add("Blue");
		myList1.add(0, "Yellow");
		myList1.add("Red");

	//	myList1.add(1);
		///Normal for loop
		for(int i = 0 ; i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		//enhance dfor loop
		for(String s : myList1) {
			System.out.println(s);
		}
		
		if(myList.contains("Blue")) {
			System.out.println("Contasins blue");
		}
		
		System.out.println("bbefore clear"+myList);
		myList.clear();

		System.out.println("after clear"+myList);
		System.out.println(myList.containsAll(myList1));
		
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setRollNo(101);
		s1.setName("Ramesh");
		s2.setRollNo(102);
		s2.setName("Ramu");
		
		List<Student> studentList  = new ArrayList();
		studentList.add(s1);
		studentList.add(s2);
	System.out.println(studentList);
		
	
	
		System.out.println(s1 instanceof Student);
		
	}

}
