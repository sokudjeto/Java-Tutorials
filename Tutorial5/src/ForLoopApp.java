public class ForLoopApp {
	public static void main(String[] args) {

		for(int i = 0;i < 5; i++){
			System.out.println("Hello " + i);
			
			//this print function prints out the value of the i as a string
			//it requires a format specifier like "%d" which indicates its a number
			//and by default it dont have the next line like the println
			//use "\n" to create a next line or
			//another sysout function for a next line after this print function
			System.out.printf("The Value of i is = %d\n" ,i);
		}
	}
}
