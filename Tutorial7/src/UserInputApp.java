import java.util.Scanner;

public class UserInputApp {

	public static void main(String[] args) {
		
		//creates a scanner object
		Scanner input = new Scanner(System.in);
		
		//output the prompt, a user is prompt to input data
		System.out.println("Enter a text line :");
		
		//wait to accept data from user input after they enter the return key
		String line = input.nextLine(); //for string and characters
		
		//Display what the user entered
		System.out.println("You entered :" + line);

//-------------------------------------------------------------------------

		//creates a scanner object
		Scanner input2 = new Scanner(System.in);
		
		//output the prompt, a user is prompt to input data
		System.out.println("Enter a value :");
		
		//wait to accept data from user input after they enter the return key
		int value = input.nextInt(); // for integers
		
		//Display what the user entered
		System.out.println("You entered :" + value);
		
		
//-------------------------------------------------------------------------
		//creates a scanner object
		Scanner input3 = new Scanner(System.in);
				
		//output the prompt, a user is prompt to input data
		System.out.println("Enter a decimal :");
				
		//wait to accept data from user input after they enter the return key
		double value2 = input.nextDouble(); // for double or decimals
				
		//Display what the user entered
		System.out.println("You entered :" + value2);
	}

}
