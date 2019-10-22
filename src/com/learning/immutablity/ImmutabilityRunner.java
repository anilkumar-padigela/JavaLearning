/**
 * 
 */
package com.learning.immutablity;

import java.util.concurrent.ThreadFactory;

/**
 * @author Padigela Anil kumar
 *
 */
public class ImmutabilityRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Anil";
		String s2 = s1;
		
		
		
		if(s1==s2) {
			System.out.println("Both References are same");
		}else {
			System.out.println("Both References are not same");
		}
		
		s2="Anil Kumar";
		if(s1==s2) {
			System.out.println("Both References are same");
		}else {
			System.out.println("Both References are not same");
		}
		
		
		String s3 = new String("Anil");
		if(s1==s3) {
			System.out.println("Both References are same");
		}else {
			System.out.println("Both References are not same");
		}
		
	}

}
