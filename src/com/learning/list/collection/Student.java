/**
 * 
 */
package com.learning.list.collection;

/**
 * @author Padigela Anil kumar
 *
 */
public class Student {

	private int rollNo;
	private String name;
	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
		this.rollNo = i;
		this.name = string;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.rollNo;
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("Executing equals method");
		if(o instanceof Student ) {
			Student s = (Student) o;
			return this.rollNo == s.getRollNo() && this.name == s.getName();
		}		
		return false;		
	}
	
	
}
