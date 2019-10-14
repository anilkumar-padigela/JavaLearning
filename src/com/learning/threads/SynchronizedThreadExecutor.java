/**
 * 
 */
package com.learning.threads;

/**
 * @author Padigela Anil kumar
 *
 */
public class SynchronizedThreadExecutor {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MultiplicationTable mt = new MultiplicationTable();
		Thread1 t1 = new Thread1(mt);
		Thread2 t2 = new Thread2(mt);
		t2.start();
		t1.start();
		//t1.join();
		
		//t2.join();
		//System.out.println(mt.k);
		//System.out.println(mt.k);
		
		//shared resource to be used by one thread i.e acquiring lock on the object
		//it is not ok to share a resouce i.e for t1 should be 40 and for t2 it should be 60
		//
		
		
	}

}

class Thread1 extends Thread{
	
	MultiplicationTable mt;
	
	public Thread1(MultiplicationTable mt) {
		this.mt = mt;
	}
	
	@Override
	public void run() {
		mt.performMultiplication(4);
	}
}


class Thread2 extends Thread{
	
	MultiplicationTable mt;
	
	public Thread2(MultiplicationTable mt) {
		this.mt = mt;
	}
	
	@Override
	public void run() {
		mt.performMultiplication(6);
	}
}

class MultiplicationTable{
	
	
	public void performMultiplication(int num) {
		
		for(int i =1; i<=100;i++) {
			System.out.println("num * "+ i + " = "+ (i*num));
		}
		
	
	}
	
	
}
