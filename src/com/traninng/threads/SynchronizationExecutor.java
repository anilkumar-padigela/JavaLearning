/**
 * 
 */
package com.traninng.threads;

/**
 * @author Padigela Anil kumar
 *
 */
public class SynchronizationExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t = new Table();
		MyThread1 thread1 = new MyThread1(t);
		MyThread2 thread2 = new MyThread2(t);
		
		thread2.start();
		thread1.start();
		
		
	}

}

class MyThread1 extends Thread{
	Table t;
	public MyThread1(Table t) {
		this.t = t;
	}
	public void run() {
		t.printNumber(50);
	}
}


class MyThread2 extends Thread{
	
	Table t;
	public MyThread2(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printNumber(5);
	}
}

class Table {
	
	public synchronized void printNumber(int n) {
		for(int i =1 ; i<5;i++)
		{
			System.out.println(i*n);
		}
	}
}
