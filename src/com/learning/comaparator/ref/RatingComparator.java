/**
 * 
 */
package com.learning.comaparator.ref;

import java.util.Comparator;

/**
 * @author Padigela Anil kumar
 *
 */
public class RatingComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie arg0, Movie arg1) {
		// TODO Auto-generated method stub
		return (int)( arg0.getRating() - arg1.getRating());
	}

}
