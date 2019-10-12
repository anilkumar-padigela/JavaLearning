/**
 * 
 */
package com.learning.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Padigela Anil kumar
 *
 */
public class CustomExceptionExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///Rule : Acct number to have minumum of 5 length
		
		Account a1 = new Account();
		a1.setAcctNumber("1234567");
		a1.setName("Ramu");
		

		Account a2 = new Account();
		a2.setAcctNumber("123");
		a2.setName("Ramu");
		
		List<Account> accountList = new ArrayList<>(); 
		accountList.add(a1);
		accountList.add(a2);
		System.out.println("Account numbers added");
		
		
		processAccounts(accountList);
		CustomExceptionExecutor ex = new CustomExceptionExecutor();
		ex.processAccounts1(accountList);
		

	}
	
	static void processAccounts(List<Account> accountList) {
		
		for(Account a : accountList) {
		
			try {
				if(a.getAcctNumber().length()>=5) {
					System.out.println("Processing"+ a.getAcctNumber());
				}else {
					throw new InValidAccountNumberException("Account number is invalid");
				}
			}catch(InValidAccountNumberException exp) {
				System.out.println("Exception occured while processing accounts"+exp.getMessage());
			}
			
		}
	}
	

 void processAccounts1(List<Account> accountList) {
		
		for(Account a : accountList) {
		
			try {
				if(a.getAcctNumber().length()>=5) {
					System.out.println("Processing"+ a.getAcctNumber());
				}else {
					throw new InValidAccountNumberException("Account number is invalid");
				}
			}catch(InValidAccountNumberException exp) {
				System.out.println("Exception occured while processing accounts"+exp.getMessage());
			}
			
		}
	}

	
}
