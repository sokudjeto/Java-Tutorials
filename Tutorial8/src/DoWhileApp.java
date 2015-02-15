import java.util.Scanner;

public class DoWhileApp {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*
		 * 
		 * A do-while statement would reduce the duplication of statements
		 * and make the code snippet more versatile.
		 * 
		System.out.println("Enter a number: ");
		
		int value = scanner.nextInt();    
		
		while(value !=5){
			
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		*/
		int value = 0; //declare variable outside do-while creates a global variable
		do{
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		while(value !=5);
		System.out.println("Got 5!");
	}
}
