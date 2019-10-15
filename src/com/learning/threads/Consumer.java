/**
 * 
 */
package com.learning.threads;

import com.learning.threads.Producer;

/**
 * @author Padigela Anil kumar
 *
 */
public class Consumer extends Thread{

	
	Producer p;
	Consumer(Producer p){
		this.p = p;
	}
	
	public void run() {
		while(true) {
		String message = p.getMessage();
		System.out.println("Message got "+message);
	}
		
	}
}
