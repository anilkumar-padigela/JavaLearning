/**
 * 
 */
package com.learning.files;

/**
 * @author Padigela Anil kumar
 *
 */
public class Employe {

	private String empId;
	private String name;
	private String department;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", name=" + name + ", department=" + department + "]";
	}
	
	
	
}
