/**


 * 
 */
package com.learning.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Padigela Anil kumar
 *
 */
public class ExceptionExecutor {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		//t1.method1();
		try {
		t1.method2();
		System.out.println("after method2");
		///
		///
		}catch(Exception exp) {
			System.out.println("in catch main");
		}
		
		System.out.println("End of main");
	}

}

class Test{
	
	
	void method1() {
		
		File f = new File("C:\\Users\\Padigela Anil kumar\\JavaMasterClass\\Batch2\\Test.java");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String st;
			while((st = br.readLine()) != null) {			
				
				
				System.out.println(st);
			}
			
		} catch (  Exception  e) {
			// TODO Auto-generated catch block
			System.out.println("Eception occured"+e.getMessage());
			//e.printStackTrace();
		}finally {
			
			System.out.println("This is my finally block");
		}
	}
	
	void method2() throws Exception {
		
		File f = new File("C:\\Users\\Padigela Anil kumar\\JavaMasterClass\\Batch2\\Test1.java");
		try {
			FileReader fr = new FileReader(f);
		} catch (Exception e) {
		//throw e;
			
		}
		
	}
	
	/*void method3() {
		
		try {
			
		}catch(Exception exp) {
			
		}
	}*/
	
	
}
