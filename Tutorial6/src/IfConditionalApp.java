public class IfConditionalApp {
	public static void main(String[] args) {

		boolean cond = 1 < 6;
		boolean cond2 = 5 != 4;
		boolean cond3 = 4 ==  3;

		int myint = 40;
		if( myint < 30) { //if statement requires a condition  
			System.out.println("Yes, it is true.");
		}
		else if (myint > 60){ //use else if you need to add another condition
			System.out.println("No, its not true.");
		}
		
		else{
			System.out.println("None of the above");
		}
		System.out.println(cond);
		System.out.println(cond2);
		System.out.println(cond3);
		
	}

}
