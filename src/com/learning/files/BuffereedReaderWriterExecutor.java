/**
 * 
 */
package com.learning.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Padigela Anil kumar
 *
 */
public class BuffereedReaderWriterExecutor {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Employe>  employeList = new ArrayList(); 
		String str = null;
		BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\Padigela Anil kumar\\\\JavaMasterClass\\\\Batch2\\\\Learning\\\\Files\\\\File4.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\\\Users\\\\Padigela Anil kumar\\\\JavaMasterClass\\\\Batch2\\\\Learning\\\\Files\\\\File5.txt"));
		while(( str =br.readLine())!=null) {
			System.out.println(str);
			
			String[] employDetails = str.split(",");
			System.out.println("employDetails ::"+employDetails[0]+employDetails[1]+employDetails[2]);
			Employe emp = new Employe();
			emp.setEmpId(employDetails[0]);
			emp.setName(employDetails[1]);
			emp.setDepartment(employDetails[2]);
			employeList.add(emp);
			//System.out.println(empIds);
			bw.write(str);
			bw.newLine();
		}
		System.out.println(employeList);
		bw.flush();
		bw.close();
		br.close();
		

		
	}

}
