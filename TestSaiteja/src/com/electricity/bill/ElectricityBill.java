package com.electricity.bill;

public class ElectricityBill {

	public static void main(String[] args) {
        String uscNumber = "6677345"; // USC Number
        int currentUnits = 236;     // Current units
        int balanceUnits = 153;     // Balance units
        double pricePerUnit = 5; // Price per unit

        int totalUnitsConsumed = currentUnits - balanceUnits;

        double totalBill = totalUnitsConsumed * pricePerUnit;

        System.out.println("Electricity Bill Details:");
        System.out.println("Name: SSR.Saiteja");
        System.out.println("USC Number: " + uscNumber);
        System.out.println("Current Units: " + currentUnits);
        System.out.println("Balance Units: " + balanceUnits);
        System.out.println("Total Units Consumed: " + totalUnitsConsumed);
        System.out.println("Price per Unit: " + pricePerUnit);
        System.out.println("Total Bill: " + totalBill);
    }
}


