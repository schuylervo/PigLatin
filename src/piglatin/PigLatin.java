package piglatin;

import java.util.Random;
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		
		// set up scanner and declare variable
		Scanner scnr = new Scanner(System.in);
		String userChoice = "y"; 
		String userString;
		String lowerCaseString;
		
		// welcome is outside of do-while loop because only needs to be printed once.
		System.out.println("Welcome to the Pig Latin Translator!");
		
		do {
		
			System.out.println("Please enter a line to be translated: ");
			userString = scnr.nextLine();
			lowerCaseString = userString.toLowerCase();
			
			String[] arrayOfStrings = lowerCaseString.split(" ", 0); 
			
				for (String stringWord : arrayOfStrings) {
					System.out.println(pigLatinConverter(stringWord));
				}
 			
			
			System.out.println("Translate another line? (y/n)");
			userChoice = scnr.nextLine();
			
		} while (userChoice.equalsIgnoreCase("y"));

		scnr.close();	

	}

	
	// This method used for the conversion of the user's string input to pig latin.  The first part of the "if" statement converts strings that begin with vowels.
	public static String pigLatinConverter (String lowerCaseString) {
		String convertedWord1= "";
		
		// 
		if (lowerCaseString.startsWith("a") || lowerCaseString.startsWith("e") 
				|| lowerCaseString.startsWith("i") || lowerCaseString.startsWith("o") 
				|| lowerCaseString.startsWith("u")) {
			convertedWord1= lowerCaseString + "way";
		} else {
			convertedWord1 = consonantConverter(lowerCaseString);
		}
		return convertedWord1;
		
	}
	
	// this is a separate method for converting words that start with a consonant to pig latin.
	public static String consonantConverter (String lowerCaseString) {
		
		char c;
		int vowelPosition = 0;
		String convertedWord2 = "";
		
		// This for loop locates the position of the first vowel
		for (int i = 0; i < lowerCaseString.length(); i++) {
			c = lowerCaseString.charAt(i);	
			
			if (c == ('a') || c == ('e') || c == ('i') || c == ('o') || c == ('u')) {
			vowelPosition = i;
			String a = lowerCaseString.substring(vowelPosition);
			String b = lowerCaseString.substring(0, vowelPosition);
			convertedWord2 = a + b + "ay";
			return convertedWord2;
			}
			
		}
		
			convertedWord2 = lowerCaseString + "ay";
			return convertedWord2;
	}


}
	
