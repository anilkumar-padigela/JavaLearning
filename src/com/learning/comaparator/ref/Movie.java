/**
 * 
 */
package com.learning.comaparator.ref;

/**
 * @author Padigela Anil kumar
 *
 */
public class Movie {
	
	private float rating;
	private String name;
	private int grossAmount;
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrossAmount() {
		return grossAmount;
	}
	public void setGrossAmount(int grossAmount) {
		this.grossAmount = grossAmount;
	}
	public Movie(float rating, String name, int grossAmount) {
		super();
		this.rating = rating;
		this.name = name;
		this.grossAmount = grossAmount;
	}
	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", grossAmount=" + grossAmount + "]";
	}
	
	
	

}
