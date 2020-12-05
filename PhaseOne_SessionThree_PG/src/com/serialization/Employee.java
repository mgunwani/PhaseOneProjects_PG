package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String employeeName;
	transient String employeeDesg;
	Address address;
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesg() {
		return employeeDesg;
	}
	public void setEmployeeDesg(String employeeDesg) {
		this.employeeDesg = employeeDesg;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeDesg=" + employeeDesg + ", address=" + address
				+ "]";
	}
	
}
