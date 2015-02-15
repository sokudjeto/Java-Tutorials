import java.util.Scanner; //java source object for scanner

public class SwitchApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //A Java Scanner is the fastest, easiest way
												//to get input from a user in Java.

		System.out.println("Enter a new command: "); //Prompt user to enter a command
		String text = input.nextLine();
		
		switch (text){
		
		case "start":
			System.out.println("Machine Started!");
			break;
			
		case "stop":
			System.out.println("Machine Stop!");
			break;
			
		default:
			System.out.println("Command not recognized!");
		
		}
		
	}
}
