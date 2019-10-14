/**
 * 
 */
package com.traninng.threads;

/**
 * @author Padigela Anil kumar
 *
 */
public class WaitNotifyExecutor {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.start();
		
		synchronized(a) {
			a.wait();
			
		}
		
		System.out.println("Total from main method"+a.total);

	}

}


class A extends Thread{
	
	int total ;
	
	public void run() {
		synchronized(this) {
			for(int i = 1 ; i<5; i++) {
				total = total +i;
			}
			this.notify();	
		}
		
		System.out.println(""+total);
	}
	
}
