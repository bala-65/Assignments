package com.bharath.assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Collections_A4 {

	public static void main (String[] args) {
		
		//declaring employee1 details using maps
		Map<String, String> employee1Map= new LinkedHashMap<String, String>();
		
		//storing employee1 data
		employee1Map.put("Employee ID","E001");
		employee1Map.put("Name","Alice Green");
		employee1Map.put("Age","30");
		employee1Map.put("Gender","Female");
		employee1Map.put("Department","Engineering");
		employee1Map.put("Position","Software Engineer");
		employee1Map.put("Salary","75,000");
		employee1Map.put("Email","alice@example.com");
		employee1Map.put("Contact Number","9876543213");
		
		
		//declaring employee2 details using maps
		Map<String, String> employee2Map= new LinkedHashMap<String, String>();
		
		//storing employee2 data
		employee2Map.put("Employee ID","E002");
		employee2Map.put("Name","Bob Johnson");
		employee2Map.put("Age","35");
		employee2Map.put("Gender","Male");
		employee2Map.put("Department","Marketing");
		employee2Map.put("Position","Marketing Manager");
		employee2Map.put("Salary","85,000");
		employee2Map.put("Email","bob@example.com");
		employee2Map.put("Contact Number","9876543214");
		
		
		//declaring employee3 details using maps
		Map<String,String> employee3Map= new LinkedHashMap<String, String>();
		
		//storing employee3 data
		employee3Map.put("Employee ID","E003");
		employee3Map.put("Name","Carol White");
		employee3Map.put("Age","28");
		employee3Map.put("Gender","Male");
		employee3Map.put("Department","Sales");
		employee3Map.put("Position","Sales Executive");
		employee3Map.put("Salary","65,000");
		employee3Map.put("Email","carol@example.com");
		employee3Map.put("Contact Number","9876543215");
		
		
		//adding all the employee maps together in a list
		List<Map<String,String>> employeeDetails= new ArrayList<Map<String,String>>();
		employeeDetails.add(employee1Map);
		employeeDetails.add(employee2Map);
		employeeDetails.add(employee3Map);
		
		//printing the email ID of bob - get(1st Index).get(the email ID we need)
		System.out.println("The Email Id of bob is: "+ employeeDetails.get(1).get("Email"));
		}
}
