package main;
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection = 0; 
		while(menuSelection !=5) {
			System.out.println("Please select a unit to convert:");
			System.out.println("1. Cups to Ounces");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. Inches to Centimeters");
			System.out.println("4. US Gallons to Imperial Gallons");
			System.out.println("5. Quit");
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			menuSelection = scanner.nextInt();
			switch (menuSelection) {
		    	case 1:
		    		System.out.println("Enter Cups to convert to Ounces:");
		    		double cupsToOunces = scanner.nextDouble();
		    		cupsToOunces = cupsToOunces * 8;
		    		System.out.println("That is " + cupsToOunces + " Ounces.");
		    		break;
		    	case 2:
		    		System.out.println("Enter Miles to convert to Kilometers:");
		    		double milesToKilo = scanner.nextDouble();
		    		milesToKilo = milesToKilo * 1.609344;
		    		System.out.println("That is " + milesToKilo + " Kilometers.");
		    		break;
		    	case 3:
		    		System.out.println("Enter Inches to convert to Centimeters:");
		    		double inToCm = scanner.nextDouble();
		    		inToCm = inToCm * 2.54;		    		
		    		System.out.println("That is " + inToCm + " Centimeters.");
		    		break;
		    		
		    	case 4:
		    		System.out.println("Enter US Gallons to convert to Imperial Gallons:");
		    		double usgToIg = scanner.nextDouble();
		    		usgToIg = usgToIg * 0.8326741881485;		    		
		    		System.out.println("That is " + usgToIg + " Imperial Gallons.");
		    		break;
		    		
		    	case 5:
		    		System.out.println("Goodbye!");
		    		break;
		    		
			}
			
		}
	}
}

