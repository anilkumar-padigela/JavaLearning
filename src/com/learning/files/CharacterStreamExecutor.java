/**
 * 
 */
package com.learning.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Padigela Anil kumar
 *
 */
public class CharacterStreamExecutor {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileReader in = null;
	      FileWriter out = null;

	      try {
	    	   in = new FileReader("C:\\Users\\Padigela Anil kumar\\JavaMasterClass\\Batch2\\Learning\\Files\\File1.txt");
	    	//  in = new FileInputStream("C:\\Users\\Padigela Anil kumar\\Entertainment\\Songs\\YenthaSakkagunnaave.mp3"); 
	         out = new FileWriter("C:\\Users\\Padigela Anil kumar\\JavaMasterClass\\Batch2\\Learning\\Files\\File3.txt");
	           
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	    	  System.out.println("File completed");
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }


	}

}
