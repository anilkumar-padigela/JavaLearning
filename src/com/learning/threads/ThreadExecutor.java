/**
 * 
 */
package com.learning.threads;

/**
 * @author Padigela Anil kumar
 *
 */
public class ThreadExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Task 1 Started
		 1 2 3 4 5 6 7 8 9 10
		Task 1 Ended
		Task 3 Started
		 21 22 23Task 2 Started
		 24 25 26 27 28 29 30 11
		Task 3 Ended
		 12 13 14 15 16 17 18 19 20
		Task 2 Ended*/
		
		Task1 task1 = new Task1();// new state
		task1.start();// runnable state
		
		
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);// new state
		task2Thread.start();// runnable state
		
		
		System.out.println("Task 3 Started");
		for(int i =21 ; i<=30; i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("Task 3 Ended");

	}

}

class Task0{
	
}

class Task1 extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Task 1 Started");
		for(int i =1 ; i<=10; i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("Task 1 Ended");
		
		
	}
	
}


class Task2 implements Runnable {

	private int k = 10;
	
	@Override
	public void run() {
		System.out.println("k value is"+k);
		// TODO Auto-generated method stub
		System.out.println("Task 2 Started");
		for(int i =11 ; i<=20; i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("Task 2 Ended");
		
	}
	
}
