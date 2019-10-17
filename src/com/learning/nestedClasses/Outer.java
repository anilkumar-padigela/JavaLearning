/**
 * 
 */
package com.learning.nestedClasses;

/**
 * @author Padigela Anil kumar
 *
 */
public class Outer {

	
	 int i =1;
	
	public static class StaticClass {
		
		void display() {
		//	i = 10;// non static  varaibles or methods can not be accessed
			System.out.println("Display from static class");
		//	outerMethod();
		}
		
		public static class NestedClass{
			
			void displayNested() {
				System.out.println("Display nested class");
			}
		}
	}
	
	public class NonstaticClass{
		void display() {
			System.out.println("Display from non  static class");
		}
	}
	
	public void outerMethod() {
		
		System.out.println("Outer method ");
		
	}
	
}
