/**
 * 
 */
package com.learning.staticRef;

/**
 * @author Padigela Anil kumar
 *
 */
public class StaticTestExecutor {

	
	static {
		System.out.println("This is static block");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1  = new Test();
		Test t2 = new Test();
		//Class level variable is accessed using class name
		System.out.println(Test.i);
		Test.m1();
		t1.i = 100;
		t1.k = 200;
		//sharing of i with t2
		System.out.println(t1.i + ":::"+t1.k);
		System.out.println(t2.i + ":::"+t2.k);
	}

}

class Test{
	
	public static int i  = 10;
	
	public int k = 20;
	
	public static void m1() {
		System.out.println(i);
	}
	
	public void m2() {
		System.out.println(i);
		
	}
}
