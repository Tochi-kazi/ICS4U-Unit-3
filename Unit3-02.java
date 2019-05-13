/**
Name: Tochi Iroakazi
Class: ICS4U 
Definition: factorial 
 */


import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		System.out.println("what is your factorial number ?");
		Scanner scanner = new Scanner (System.in);
		int input = scanner.nextInt();
		//check if the number equals zero
		if (input == 0 ||  input == 1) {
			System.out.println(input);
		}else {
			System.out.println("The factorial is: " + Num (input));
		}
				

	}
	public static int Num ( int factorial) {
		//decrement factorial by one and send it into a recursion.
		if(factorial > 0) {
			int total  = factorial * Num(factorial - 1);	
			return total;
		}
		//just to have a return value with an integer so the code will work ; ) 
		return 1;
		
	}

}
