/**
 * 
 */
package com.learning.Kundana_Practise;

/**
 * @author Padigela Anil kumar
 *
 */
public class GenericExecutor {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericsMyList<String> genericsMyListobj = new GenericsMyList<String>();
		genericsMyListobj.addelement("Kuns");
		genericsMyListobj.addelement("sanju");
		
		GenericsMyList<Integer> genericsMyListobj1 = new GenericsMyList<Integer>();
		genericsMyListobj1.addelement(10);
		genericsMyListobj1.addelement(20);
		
		GenericsMyList<Number> genericsMyListobj2 = new GenericsMyList<Number>();
		genericsMyListobj2.addelement(10);
		genericsMyListobj2.addelement(20.12);
		
		System.out.println(genericsMyListobj);
		
		
	}

}
