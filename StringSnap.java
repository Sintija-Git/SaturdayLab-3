package Lab3;
import java.util.Scanner;
/**
StringSnap -- checks whether 2 Strings are the same, and then prints "SNAP" if they are the same.
Instruction: Once we finish writing a program we must test it to make sure that the program works exactly as described in the problem's text.
Compile and run the program with the next inputs:
Test 1:
enter first word:
john
enter second word:
john
the result should be:
SNAP !!!
------------------------
Test2:
enter first word:
john
enter second word:
mark
no message should be displayed
-------------------------
Test 3:
enter first word:
john
enter second word:
JOHN
the result should be:
SNAP1, with ignoreCase
SNAP2 with UpperCase
*/

public class StringSnap {

	public static void main (String[] args) {
		
		//declare local variables
		String firstWord, secondWord;
		
		 // declare a variable named input to be able to work with objects of type Scanner
		Scanner input;
		
		// create a Scanner object to read input from the keyboard
		input = new Scanner (System.in);
		
		// prompt the user to enter both first and secon word
		System.out.println("Please enter the first word here: ");
		// read the string provided by the user
		firstWord = input.next();
		
		System.out.println("Please enter the second word here: ");
		 // read the string provided by the user
		secondWord = input.next();
		
		// create a method to compare users input - whether both strings are the same!!!
		if (firstWord.equals(secondWord)) {
			System.out.println("SNAP, same words !!!");
			
		} else {
			System.out.println ("Not the same words, check your input!");
			
		}
		
		System.out.println ("_______________________");
		System.out.println ("Lets check if both words are different");
		if (!firstWord.equals(secondWord)) {
		System.out.println ("Yes! Both words are different!");
		} else {
		System.out.println ("Nope! Both words are the same!");
		}
		System.out.println ("_______________________");
		if (firstWord.equalsIgnoreCase(secondWord));
		System.out.println ("SNAP1 with ignoreCase");
	
		//OR USE BOOLEAN METHOD THAT IS THE SAME AS ABOVE	
//		boolean isEqual = secondWord.equalsIgnoreCase(firstWord);
//		if (isEqual) {
//			System.out.println ("SNAP1 with ignoreCase");
			
		System.out.println ("_______________________");
		firstWord = firstWord.toUpperCase();
		secondWord = secondWord.toUpperCase();
		
		if (firstWord.equals(secondWord)) {
			System.out.println("SNAP2 with UpperCase");
			
		}
	}
	
}
