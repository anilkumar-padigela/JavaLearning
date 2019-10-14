/**
 * 
 */
package com.learning.threads;

/**
 * @author Padigela Anil kumar
 *
 */
public class YeildThreadMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread1 t1 = new MyThread1();
t1.start();

for(int k = 10 ; k<15;k++) {
	Thread.yield();//control goes to the child thread
	System.out.println(k);
}
	}

}


class MyThread1 extends Thread{
	
	public void run() {
		
		for(int i =1 ; i<5;i++) {
			System.out.print(i);
		}
		
	}
}
