package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class SerializationExample {
	
	public static void main(String[] args) {
		
		Address add = new Address();
		add.setHouseno("123");
		add.setCity("Delhi");
		add.setStreet("Civil Lines");
		
		Employee emp = new Employee();
		emp.setEmployeeName("King");
		emp.setEmployeeDesg("Manager");
		emp.setAddress(add);
		
		
		try {
			
			FileOutputStream fileOut = new FileOutputStream("D:\\employee.ser");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(emp);
			System.out.println("Object Serialized Successfully..");
			outStream.close();
			fileOut.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
