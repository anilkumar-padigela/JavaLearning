/**
 * 
 */
package com.learning.defalutMethods;

/**
 * @author Padigela Anil kumar
 *
 */
public class DefaultExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MexicanPizza mp = new MexicanPizza();
		mp.addCheese();
	}

}

class MexicanPizza implements IPizza{

	@Override
	public void addSauce() {
		// TODO Auto-generated method stub
		System.out.println("Added sauce");
	}
	
}
