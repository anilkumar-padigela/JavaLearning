/**
 * 
 */
package com.learning.threads;

import com.learning.threads.Consumer;
import com.learning.threads.Producer;

/**
 * @author Padigela Anil kumar
 *
 */
public class ConsumerProducerThreadExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Program Started");
		Producer p = new Producer();
		p.start();
		Consumer c = new Consumer(p);
		c.start();
		System.out.println("Program Ended");
	
	}

}


