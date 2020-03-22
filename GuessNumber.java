package Lab3;
/* Guess a number between 1 and 10!
Generate a secret number, and compare the number with a given (i.e. guessed) number. 
The user (i.e. another class) of the instantiable class GuessNumber should provide the guessed number via the setGuess().
*/

public class GuessNumber {
	//declare instance variables
	private int secret; // to store the number generated by CPU
	private int guess; // to store the number generated by user
	private String message; // to store message that number is ==, < or >
	
	// create constructor w/out any value
	public GuessNumber() {	// generate a random nr between 1-10

	double r1 = Math.random(); // uses to create a random number stored in r1
	double r2 = r1 * 10; // Starts with 0....9
//	System.out.println ("r2: "+ (int) r2); // I DONT UNDERSTAND THESE LINES 18 and 20
	double r3 = r2 +1; // 1....10 , we are adding 1 to escape 0 number which is not allowed by the task description
//	System.out.println ("r3: "+ (int) r3);
	
	secret = (int) r3;
	} 
//	//OPTION2
//	secret = (int) (Math.random()*10) + 1;	
	
	//declare setter method for guess instance variable
	public void setGuess (int n) {
	guess = n;
	}
	// declare the processing using compute method
	public void compare() {
	if (guess == secret) {
		message = "Congrats!";
		
	} else if (guess < secret){
		message = "Too low. Try again!";
		
	} else {
		message = "Too high. Try again!";
		
		}
	}
	
	// declare getter () to retrieve the message
	public String getMessage ()	 {
		return message;
	}
	// declare getter () to retrieve the secret number generated by computer CPU
	public int getSecret () {
		return secret;
		
	}
	
}//end class
