package com.bharath.assignments;

public class EmpGroups_A3 {
	
	public static void main (String [] args) {
		
		//declaring arrays to store the data along with the size
		String[] names= new String[3];
		int[] ids= new int[3];
		
		//creating obj for the empNames to access it in this class
		Employees_A3 empNames= new Employees_A3();
		names[0]= empNames.empName1;
		names[1]= empNames.empName2;
		names[2]= empNames.empName3;
		
		//creating obj for the empIds to access it in this class
		Employees_A3 empIds= new Employees_A3();
		ids[0]= empIds.empId1;
		ids[1]= empIds.empId2;
		ids[2]= empIds.empId3;
		
		
		//printing each employee names along with their employee Ids
		System.out.println("The Employee Name is: " + names[0] +" "+ "and the Employee Id is: " + ids[0]);
		System.out.println("The Employee Name is: " + names[1] +" "+ "and the Employee Id is: " + ids[1]);
		System.out.println("The Employee Name is: " + names[2] +" "+ "and the Employee Id is: " + ids[2]);
		
	}
}
