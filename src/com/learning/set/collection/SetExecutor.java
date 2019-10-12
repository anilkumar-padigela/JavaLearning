package com.learning.set.collection;

import java.util.*;

import com.learning.list.collection.Student;

public class SetExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set studentSet = new HashSet();
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setRollNo(101);
		s1.setName("Ramesh");
		s2.setRollNo(101);
		s2.setName("Ramu");
		studentSet.add(s1);
		studentSet.add(s2);
		
		System.out.println(studentSet);
		
		if(s1.equals(s2)) {
			System.out.println("s1,s2 are equal");
		}
		
		Iterator itr = studentSet.iterator();
		while(itr.hasNext()) {
			//Student s = (Student)itr.next();
			System.out.println("Printing the student object"+itr.next());
		}
		
		System.out.println("Size of the set"+studentSet.size());
		Student sArray1[] = new Student[studentSet.size()];
		studentSet.toArray(sArray1);
		Object sArray[] = studentSet.toArray();
		for(Object sElement : sArray) {
			System.out.println("Printing sElement"+sElement);
		}
		List<Student> list = Arrays.asList(sArray1);
		
		Iterator listItr = list.iterator();
		while (listItr.hasNext()) {
			Student student = (Student) listItr.next();
			System.out.println(student);
			
		}
		
	Set studentSet2 = new HashSet();
	Student s3 = new Student(102, "Rao");
	studentSet2.add(s3);
	System.out.println(studentSet.retainAll(studentSet2));
	System.out.println("After retail all size"+studentSet.size());
	

		
	}

}
