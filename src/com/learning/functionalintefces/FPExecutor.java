package com.learning.functionalintefces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class FPExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		List<String> listString = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		list.stream().forEach(element -> System.out.println(element));
		listString.stream().forEach(element -> System.out.println(element));
		list.stream().forEach(new PrintElements());
		List<Integer> squareList = new ArrayList<>();
		//square each element
		//list.stream().map(element->element*element).forEach(element -> squareList.add(element));
		
		Function<Integer, Integer> f = new SquareNumbers();
	//	f.
		list.stream().map(new SquareNumbers()).forEach(element -> squareList.add(element));
		list.stream().map(f).forEach(element -> squareList.add(element));
		System.out.println(squareList);
		//Storing lambda expression in a variable		
		Function<? super Integer, ? extends Integer> square = createSquare();
		
		list.stream().map(square).forEach(element -> squareList.add(element));
		//list.add(null);
		System.out.println( list.stream().max((n1,n2)->{
			if(n1!=null && n2!=null) {
				return Integer.compare(n1, n2);
			}
			return 0;
		}));
		
		List<Integer>  secopndList = new ArrayList<>(); 
	//	secopndList.add(null);
 Optional<Integer> i =	secopndList.stream().max((n1,n2)->{
		//System.out.println(n1);
		//System.out.println(n2);
		if(n1!=null && n2!=null) {
				
				return Integer.compare(n1, n2);
			}
			
			return 0;
		});
	
 //System.out.println(i.);
 
	}
	

	/*
	 * Method that returns a functional interface instance or lambda expression
	 * 
	 */
	
	public static Function<? super Integer, ? extends Integer> createSquare(){
		
		return t -> t*t;
	}

}

class SquareNumbers implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		return t*t;
	}
	
	public Integer cubeNumbers(Integer t) {
		return t*t*t;
	}
	
}

class PrintElements implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}
