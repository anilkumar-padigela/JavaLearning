/**
 * 
 */
package com.traninng.threads;

/**
 * @author Padigela Anil kumar
 *
 */
public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Task1 task1 = new Task1();
		task1.start();
		
		
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();
		
		System.out.println("Task 3 Started");
		for(int i =21 ; i<=30; i++) {
			System.out.print(" "+i);
		}
		System.out.println("Task 3 Ended");
	}
		
}

class Task1 extends Thread{
	
	public void run() {
		System.out.println("Task 1 Started");
		for(int i =1 ; i<=10; i++) {
			System.out.print(" "+i);
		}
		System.out.println("Task 1 Ended");
	}
	
}

class Task2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Task 2 Started");
		for(int i =11 ; i<=20; i++) {
			System.out.print(" "+i);
		}
		System.out.println("Task 2 Ended");
		}
	
}
