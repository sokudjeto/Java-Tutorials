public class IfandWhileApp {
	public static void main(String[] args) {

		int loop = 0;
		
		//combining a while loop and using an if statement to determine the end of the loop
		while(true){
			
			System.out.println("Looping :"+ loop);
			
			if (loop == 9){
				break; //this stops an iteration
			}
			
			loop++;
		}
	}
}
