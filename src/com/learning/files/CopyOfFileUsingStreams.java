/**
 * 
 */
package com.learning.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Padigela Anil kumar
 *
 */
public class CopyOfFileUsingStreams {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	        // in = new FileInputStream("C:\\Users\\Padigela Anil kumar\\JavaMasterClass\\Files\\Test1.docx");
	    	 in = new FileInputStream("C:\\Users\\Padigela Anil kumar\\Entertainment\\Songs\\YenthaSakkagunnaave.mp3"); 
	         //out = new FileOutputStream("C:\\\\Users\\\\Padigela Anil kumar\\\\JavaMasterClass\\\\Files\\\\song.mp3");
	    	//  in = new FileInputStream("C:\\Users\\Padigela Anil kumar\\JavaMasterClass\\Batch2\\Learning\\Files\\File1.txt"); 
	    	  //out = new FileOutputStream("C:\\Users\\Padigela Anil kumar\\JavaMasterClass\\Batch2\\Learning\\Files\\CopyOfFile1.txt");
	    	 
	    	 out = new FileOutputStream("C:\\\\Users\\\\Padigela Anil kumar\\\\JavaMasterClass\\\\Batch2\\\\Learning\\\\Files\\\\song.mp3");
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	    	  System.out.println("File reading is completed");
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }


	}

}
