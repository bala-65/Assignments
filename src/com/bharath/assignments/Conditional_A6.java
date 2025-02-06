package com.bharath.assignments;

public class Conditional_A6 {

	public static void main(String[] args) {

		// customer's details
		String customerName = "John doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;

		// credit score greater than 750
		if (creditScore >= 750) {
			System.out.println("The customer's loan is automatically approved");
		}

		// credit score in between 650 and 750, income>=50000.0 && isEmployed== true
		// debtToIncomeRatio <= 40.0
		else if (creditScore >= 650 && creditScore < 750) {
			System.out.println("Additional checks are performed for " + customerName +"!");
			if (income >= 50000.0) {
				if (isEmployed) {
					if (debtToIncomeRatio < 40.0) {
						System.out.println(customerName + " is eligible for the loan.");
					} else {
						System.out.println(customerName + " is not eligible for the loan because of the high DTI ratio.");
					}
				} else {
					System.out.println(customerName + " is not eligible for the loan because of unemployment.");
				}
			} else {
				System.out.println(customerName + " is not eligible for the loan as his income is below 50000.");
			}
		} else {
			System.out.println(customerName + " is not eligible for the loan because of his poor credit score.");
		}
	}
}
