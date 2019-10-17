/**
 * 
 */
package com.learning.nestedClasses;

import java.io.Serializable;

/**
 * @author Padigela Anil kumar
 *
 */
public class InnerClassExecutor implements Serializable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.StaticClass sc = new Outer.StaticClass();
		sc.display();
		
		Outer.StaticClass.NestedClass nc = new Outer.StaticClass.NestedClass();		
		nc.displayNested();
		
		
		Outer o = new Outer();
		Outer.NonstaticClass nsc = o.new NonstaticClass();
		nsc.display();
		//Outer.StaticClass sc = new Outer.StaticClass();
		// Outer.InnerClass ic = new Outer().new InnerClass();
	}

}
