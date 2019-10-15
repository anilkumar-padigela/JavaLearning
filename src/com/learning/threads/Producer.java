/**
 * 
 */
package com.learning.threads;

import java.util.Date;
import java.util.Vector;

/**
 * @author Padigela Anil kumar
 *
 */
public class Producer  extends Thread{
	
	Vector<String> messages = new Vector<String>();
	int MESSAGE_CAPACITY = 5;
	
	public void run() {
		while(true) {
		System.out.println("Start: putting the message");	
		putMessage();
		System.out.println("End: putting the message");
	}
	}
	
	public synchronized void putMessage() {
		if(messages.size() == MESSAGE_CAPACITY) {
			System.out.println("Let the consumer consume");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Adding message");
		messages.add(new Date().toString());
		
		this.notifyAll();
		
	}
	
	public synchronized String getMessage() {
		notify();
		if(messages.size() == 0) {
			System.out.println("Let the producer start producing");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String firstElement = messages.firstElement();
		System.out.println("Removing the element "+firstElement);
		messages.remove(firstElement);
		return firstElement;
	}

}
