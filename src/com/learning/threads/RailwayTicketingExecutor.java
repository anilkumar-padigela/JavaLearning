/**
 * 
 */
package com.learning.threads;

/**
 * @author Padigela Anil kumar
 *
 */
public class RailwayTicketingExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RailwayTicketing rtl = new RailwayTicketing();
		BookTicketsThread t1 = new BookTicketsThread(rtl);
		BookTicketsThread t2 = new BookTicketsThread(rtl);
		BookTicketsThread t3 = new BookTicketsThread(rtl);
		t1.start();
		t2.start();
		t3.start();
		
	}

}

class BookTicketsThread extends Thread{
	
	RailwayTicketing rtl;
	
	public BookTicketsThread(RailwayTicketing rtl) {
		this.rtl = rtl;
	}
	
	public void run() {
		
		rtl.bookTicket();
	}
}



class RailwayTicketing {
	
	//int[] railwayTickets = new int[75];
	int incrementor = 1;
	int numOfTickets = 75;
	boolean seatAlloated;
	public  void bookTicket()  {
		
		try {
			synchronized(this) {
			System.out.println("Ticket alloted to thread"+Thread.currentThread().getName() + " is "+ incrementor);
			
			System.out.println("Start:Performing transactions ");
			Thread.sleep(2000);
			System.out.println("End : Performing transactions ");
			incrementor++;
			}
			
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
	
	
	
}
