package com.learning.comparable.ref;
/**
 * 
 */

/**
 * @author Padigela Anil kumar
 *
 */
public class Employe implements Comparable<Employe>{

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Employe o) {
		// TODO Auto-generated method stub
		System.out.println("this.id "+this.id+":::o.id "+o.id);
		return this.id - o.id;
	}
	
	
}
