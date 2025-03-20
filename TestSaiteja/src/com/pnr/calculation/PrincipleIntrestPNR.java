package com.pnr.calculation;

public class PrincipleIntrestPNR {

	    public static void main(String[] args) {
	        // Input values
	        double principal = 200000; // Principal amount
	        double rate = 5;          // Rate of interest (in percentage)
	        double time = 2;          // Time period (in years)

	        double simpleInterest = (principal * rate * time) / 100;

	        double totalAmount = principal + simpleInterest;

	        System.out.println("Simple Interest: " + simpleInterest);
	        System.out.println("Total Amount (Principal + Interest): " + totalAmount);
	    }

}
	
