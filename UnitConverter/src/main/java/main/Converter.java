package main;
import java.util.Scanner;

//this class converts units
public class Converter {
	public static void main(String[] args) {
		//there are 3 menus, 1 for the main menu and 2 others for the nested menus
		int menu1 = 0;
		int menu2 = 0; 
		int menu3 = 0;
		//scanner has to be outside of loop to close
		Scanner scanner = new Scanner(System.in);
		while(menu1 !=3) {
			
			System.out.println("Select a unit to convert by Volume or Distance -");
			System.out.println("1. Volume");
			System.out.println("2. Distance");
			System.out.println("3. Quit");
			System.out.println("Type your selection and press enter:");
			
			menu1 = scanner.nextInt();
			switch (menu1) {
			//main
			case 1:
				System.out.println("Select a volume unit to convert -");
				System.out.println("1. Cups to Ounces");
				System.out.println("2. US Gallons to Imperial Gallons");
				System.out.println("Enter your selection:");
				menu2 = scanner.nextInt();
				//nested
				switch (menu2) {
				
					case 1:
			    		System.out.println("Enter Cups to convert to Ounces:");
			    		double cupsToOunces = scanner.nextDouble();
			    		cupsToOunces = cupsToOunces * 8;
			    		System.out.println("That is " + cupsToOunces + " Ounces.");
			    		break;
			    		
					case 2:
			    		System.out.println("Enter US Gallons to convert to Imperial Gallons:");
			    		double usgToIg = scanner.nextDouble();
			    		usgToIg = usgToIg * 0.8326741881485;		    		
			    		System.out.println("That is " + usgToIg + " Imperial Gallons.");
			    		break;
				
					default: System.out.println("Please enter a number.");
		    		}
					break;
			//main
			case 2:
				System.out.println("Select a distance unit to convert -");
				System.out.println("1. Miles to Kilometers");
				System.out.println("2. Inches to Centimeters");
				System.out.println("Enter your selection:");
				menu3 = scanner.nextInt();
				//nested
				switch (menu3) {
		    	
					case 1:
			    		System.out.println("Enter Miles to convert to Kilometers:");
			    		double milesToKilo = scanner.nextDouble();
			    		milesToKilo = milesToKilo * 1.609344;
			    		System.out.println("That is " + milesToKilo + " Kilometers.");
			    		break;
			    	
			    	case 2:
			    		System.out.println("Enter Inches to convert to Centimeters:");
			    		double inToCm = scanner.nextDouble();
			    		inToCm = inToCm * 2.54;		    		
			    		System.out.println("That is " + inToCm + " Centimeters.");
			    		break;
			    		
			    	default: System.out.println("Please enter a number.");
		    		}	
					break;
				//quit
		    	case 3:
		    		System.out.println("Goodbye!");
		    		break;
		    		
		    	default: 
		    		System.out.println("Please enter a number.");

		    		
				}
			}
		scanner.close();
		}
}

