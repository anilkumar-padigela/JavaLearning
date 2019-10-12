/**
 * 
 */
package com.learning.inheritance;
import com.learning.packageExperiments.*;
/**
 * @author Padigela Anil kumar
 *
 */
 class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOne c1 = new ChildOne();
		c1.m3();
		c1.m1();
		
		Parent p1 = new Parent();
		p1.m1();
		
		//Parent reference  holding child variable
		Parent p2 = new ChildOne();
		p2.m1();
		//p2 can n ot access m3 and m4 
		//if m1 is not over rideen then m1  of parent is invoked
		
		System.out.println(p2.i + "  "+ p1.i);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		Ferarri f = new Ferarri();
		System.out.println(f.maxSpeed); 
		//Animal a = new Animal();
	}

}
