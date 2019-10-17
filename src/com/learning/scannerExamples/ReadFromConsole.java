/**
 * 
 */
package com.learning.scannerExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author Padigela Anil kumar
 *
 */
public class ReadFromConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		
		String word = sc.nextLine();
		System.out.println("Given input:"+word);
		
		
		int listSize = sc.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i =1; i<=listSize; i++) {
			list.add(sc.nextLine());
		}
		
		System.out.println("Printing the list"+list);
		
		HashMap<String , String> hp = new HashMap<String, String>(); 

	}

}
