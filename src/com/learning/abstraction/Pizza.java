/**
 * 
 */
package com.learning.abstraction;

/**
 * @author Padigela Anil kumar
 *
 */
public abstract class Pizza implements ISauce {
	
	public void pizzaBase() {
		System.out.println("This is common implementation for all pizzas");
		
	}
	
	abstract void addOns();
	
	abstract void extraCheese();

	
	@Override
	public void addSauce() {
		System.out.println("Add sauce");
	}
}
