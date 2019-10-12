/**
 * 
 */
package com.learning.comparable.ref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Padigela Anil kumar
 *
 */
public class SortingExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe e1 = new Employe(2,"Ramu");
		Employe e2 = new Employe(1,"Raju");
		Employe e3 = new Employe(3,"Anil");
		Employe e4 = new Employe(4,"Anil");
		Employe e5 = new Employe(5,"Anil");
		
		List<Employe> myList = new ArrayList<Employe>();
		myList.add(e5);
		myList.add(e2);
		myList.add(e3);
		myList.add(e1);
		myList.add(e4);
		
		/*for(Employe o : myList) {
			System.out.println(o.getId());
		}
		*/
		Collections.sort(myList);
		for(Employe o : myList) {
			System.out.println(o.getId());
		}
		
	}

}
