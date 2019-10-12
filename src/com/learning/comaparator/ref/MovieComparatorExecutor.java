/**
 * 
 */
package com.learning.comaparator.ref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Padigela Anil kumar
 *
 */
public class MovieComparatorExecutor {
	public static void main(String[] args) {
		
		Movie m1 = new Movie((float) 5.0, "Avatar", 2000);
		Movie m2 = new Movie((float) 2.0, "Avatar1", 2000);
		Movie m3 = new Movie((float) 1.0, "Avatar3", 2000);
		Movie m4 = new Movie((float) 6.0, "Avatar2", 2000);
		Movie m5 = new Movie((float) 9.0, "Avatar5", 2000);
		
		List<Movie> myMovieList = new ArrayList<Movie>();
		
		/*List myTestList = new ArrayList();
		myTestList.add(1);
		myTestList.add("Anil");
		myTestList.add(m1);
		*/
			
		
		myMovieList.add(m1);
		myMovieList.add(m2);
		myMovieList.add(m3);
		myMovieList.add(m4);
		myMovieList.add(m5);
		
		
		Collections.sort(myMovieList, new RatingComparator());
		
		for(Movie m : myMovieList) {
			
			System.out.println(m);
			
		}
		
		
	}

}
