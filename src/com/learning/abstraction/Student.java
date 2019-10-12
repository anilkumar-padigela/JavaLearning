/**
 * 
 */
package com.learning.abstraction;

/**
 * @author Padigela Anil kumar
 *
 */
public class Student {
	
	int rollNo ;
	
	public Student (int rollNumber){
		this.rollNo = rollNumber;
	}

	
	public boolean equals(Student o) {
		return this.rollNo ==o.rollNo;
		
	}
}
