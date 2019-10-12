/**
 * 
 */
package com.learning.set.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.learning.list.collection.Student;

/**
 * @author Padigela Anil kumar
 *
 */
public class HashSetExecutoe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<String> stringSet = new HashSet<String>();
		
		stringSet.add("yellow");
		stringSet.add("yellow");
		
		
		System.out.println(stringSet);

		Student s1 = new Student(101,"Ramu");
		Student s2 = new Student(102,"Ramesh");
		Student s3 = new Student(101,"Ramu");
		
		Set<Student> studentSet =  new HashSet<Student>();
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		
		//ystem.out.println("Hash code of s1 , s2, s3"+s1.hashCode()+"::"+s2.hashCode()+"::"+s3.hashCode());
		System.out.println("Hash code of s1 , s2, s3"+s1.hashCode()+"::"+s2.hashCode()+"::"+s3.hashCode());
		
		System.out.println(studentSet);
		
		
		TreeSet ts = new TreeSet();
		
		ts.add(1);
		ts.add(5);
		ts.add(3);
		System.out.println(ts);
		
	}

}
