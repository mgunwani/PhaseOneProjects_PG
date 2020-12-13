package QueueImplementations;

import java.util.ArrayDeque;
import java.util.Deque;

class Employee {
	int EmpId;
	String EmpName;
	String EmpDesg;
	public Employee(int empId, String empName, String empDesg) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpDesg = empDesg;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpDesg=" + EmpDesg + "]";
	}
}

public class DequeEmployeeExample {

	public static void main(String[] args) {
		
		Deque<Employee> emps = new ArrayDeque<Employee>();
		emps.add(new Employee(101, "Bhawna", "Trainer"));
		emps.add(new Employee(102, "Sarah", "Manager"));
		emps.add(new Employee(103, "James", "Consulatant"));
		
		for (Employee employee : emps) {
			System.out.println(employee);
		}
		
		
		
		
	}
}
