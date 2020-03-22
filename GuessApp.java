package Lab3;
import java.util.*; // * all not only Scanner
/**
GuessApp 
	uses the instantiable class GuessNumber
	allows the user to guess a number 1 time
*/
public class GuessApp {

	public static void main(String[] args) {
		//declare local variable num to store the number provided by the user
		int num;
		
		int secret;
		String message;

		// declare the variable named input, and create an object of type Scanner
		Scanner input;
		input = new Scanner (System.in);
		
		// declare a variable named checker and create an object of type GuessNumber -  to be able to access the instantiable class and its methods
		GuessNumber checker = new GuessNumber ();
		
		// input  - prompt the user to enter the number 
		System.out.println("Enter your guess from 1 to 10 here: ");
		num = input.nextInt(); // to show the input
		
		// to assing/store in the instance variable guess of the Obj checker the number provided by the user 
		//and save in the local variable num!!!
		checker.setGuess(num);
		
		//processing 
		//call method compare on obj checker to determine whether the guess was right
		checker.compare();
		
		//output
		//retrieve the message to find out if the guess was right or numer provided was higher or lower as in the messages from GuessNumber
		//save the message in the variable called m
		String m = checker.getMessage();
		System.out.println (m);
		
		//retrieve the secret number from our GuessName class
		int s = checker.getSecret ();
		System.out.println ("The secret number is " + s);
		
	}	//end main

} //end class
