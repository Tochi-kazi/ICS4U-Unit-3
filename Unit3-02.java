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
		
		if (input == 0) {
			System.out.println("Stupid number");
		}else {
			System.out.println(Num (input));
		}
				

	}
	public static int Num ( int factorial) {
	
		if (factorial == 1)
			return 1;
		else
			return (factorial * Num(factorial - 1));

		
	}

}
