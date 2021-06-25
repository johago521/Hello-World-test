package main;

import java.util.Scanner;

public class Converter{
	
	public static void menu() {
		System.out.println("1. Cups to Teaspoons\n2. Miles to Kilometers\n3. US Gallons to Imperial Gallons\n4. Quit\n" );
	}
	
	public static void showCups( double userInput  ) {
		double cups;
		cups = userInput * 48;
		System.out.printf( "%.2f Cups converted to Teaspoons is %.2f\n\n", userInput, cups );
	}
	
	public static void showMiles( double userInput  ) {
		double miles;
		miles = userInput * 1.60;
		System.out.printf( "%.2f Miles converted to Kilometers is %.2f\n\n", userInput, miles );
	}
	
	public static void showGallons( double userInput  ) {
		double gallons;
		gallons = userInput * 0.83 ;
		System.out.printf( "%.2f Gallons converted to Imperial Gallons is %.2f\n\n", userInput, gallons );
	}
	
	public static void showError (String errorMessage ) {
		System.out.println("Error:" + errorMessage);
	}

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double userInput;
		int sentinel = 4;
		int menuSelection;
		
		System.out.println("Please enter a number:");
		userInput = scanner.nextDouble();
		
		while(userInput < 0 ) {
			System.out.println("Please enter a positive number:");
			userInput = scanner.nextDouble();
		}
		
		menu();
		
		System.out.println(" Please choose an option: \n");
		menuSelection = scanner.nextInt();
		
		while(menuSelection != sentinel ) {
			if(menuSelection == 1 ) {
				showCups(userInput);
			} else if (menuSelection == 2) {
				showMiles(userInput);
			} else if (menuSelection == 3 ) {
				showGallons (userInput);
			} else {
				showError("Please enter a valid option");
			} 
		menu();
		System.out.println(" Please choose an option: ");
		menuSelection = scanner.nextInt();
		
		}
		
		System.out.println("Good Bye!");
		
	}
	
}