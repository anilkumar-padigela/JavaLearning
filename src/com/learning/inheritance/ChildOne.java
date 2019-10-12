/**
 * 
 */
package com.learning.inheritance;

/**
 * @author Padigela Anil kumar
 *
 */
public   class ChildOne extends Parent {
	
	public int i = 50;

	// Always a constructor is invoked when a object is created
	// Always a super class constructor is invoked for a child class
	public ChildOne() {

		System.out.println("In ChildOne constructor");
	}

	public void m3() {

		System.out.println(" In the child one m3");
	}

	public void m4(String s1, String s2) {
		System.out.println("S1:::" + s1 + " S2:::::" + s2);
	}

	// Overloading with different data parameters
	public void m4(String s1, int s2) {
		System.out.println("S1:::" + s1 + " S2:::::" + s2);
	}

	// Overloading by adding new parameters
	public void m4(String s1, String s2, String s3) {
		System.out.println("S1:::" + s1 + " S2:::::" + s2);
	}

	// Overriding parent m1 method
	public void m1() {

		System.out.println("ChildOne m1 method");
		System.out.println("Value of i"+i);
	}

}
