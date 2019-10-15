/**
 * 
 */
package com.learning.threads;

/**
 * @author Padigela Anil kumar
 *
 */
public class WaitNotifyThreadExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.start();
		synchronized(c) {
			try {
				c.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Total is "+c.total);
	}

}


class Calculator extends Thread {
	
	int total  = 0;
	
	public void performAddition() {
	try {	
		for(int i = 0; i<=5; i++) {
			total = total +i ;
		}
		System.out.println("Addition completed "+total);
		//this.notify();
	}catch(Exception exp) {
		exp.printStackTrace();
	}
	}
	
	public void run() {
		performAddition();
	}
}
