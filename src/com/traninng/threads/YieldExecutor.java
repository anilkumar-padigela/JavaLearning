/**
 * 
 */
package com.traninng.threads;

/**
 * @author Padigela Anil kumar
 *
 */
public class YieldExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTask thread1 =  new MyTask();
		thread1.start();
		
		for(int i = 1 ; i<5;i++) {
			//Thread.yield(); // control passes to the child thread
			System.out.println(Thread.currentThread().getName() + "in control");
		}
	}

}

class MyTask extends Thread{
	
	public void run() {
		for(int i = 1 ; i<10 ; i++)
		System.out.println(Thread.currentThread().getName()+" in control");
	}
}

