package com.learning.functionalintefces;

import java.util.ArrayList;
import java.util.List;
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
