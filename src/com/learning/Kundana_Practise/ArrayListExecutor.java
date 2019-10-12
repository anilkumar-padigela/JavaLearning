/**
 * 
 */
package com.learning.Kundana_Practise;
import java.util.*;

import javax.print.DocFlavor.STRING;

/**
 * @author Padigela Anil kumar
 *
 */
public class ArrayListExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List myList1 = new ArrayList();
		
		myList1.add("Kundana");
		myList1.add("Kuns");
		myList1.add(1,"kuns2");
		myList1.add(1,"24");
		
		for (int i=0;i<myList1.size();i++)
		{
		
			System.out.println(myList1.get(i));
		}
		
		List<String> myList2 = new ArrayList();
		myList2.add("Kundana");
		myList2.add("Kuns");
		myList2.add(1,"kuns2");
		
		myList2.containsAll(myList1);
		
		
	}

}
