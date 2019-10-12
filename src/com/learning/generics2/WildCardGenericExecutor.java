package com.learning.generics2;

import java.util.*;

public class WildCardGenericExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List li = Arrays.asList(1,2,"Anil", 1.1f); 
doSomething(li);

List<String> ls = Arrays.asList("Anil","Ramu");
doSomething(ls);

//List<Animal> animalList = Arrays.asList(new Animal("Dog"), new Animal("Cat"));

//doSomething(animalList);

	}
	
	
	public static void  doSomething(List<?> list) {
		
	
		for(Object a : list) {
			
			if(a instanceof Animal ) {
				System.out.println("It is instance of animal");
			}else if(a instanceof Integer){
				System.out.println("It is instance of Integer");
			}else {
				System.out.println(a);	
			}
			
		}
		
	}

}
