/**
 * 
 */
package com.learning.defalutMethods;

/**
 * @author Padigela Anil kumar
 *
 */
public interface IPizza {

	
	void addSauce();
	
	
	default void addCheese() {
		
		System.out.println("Extra cheese");
	}
}
