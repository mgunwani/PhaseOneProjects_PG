package com.additional;

public class Employee implements Comparable<Employee> {
	
	int EmpId;
	String EmpName;
	int EmpAge;
	
	public Employee(int empId, String empName, int empAge) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpAge = empAge;
	}

	@Override
	public int compareTo(Employee emp) {
		if(this.EmpAge == emp.EmpAge)
			return 0;
		else if(this.EmpAge > emp.EmpAge) 
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpAge=" + EmpAge + "]";
	}
	
}
