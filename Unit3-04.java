/**
 Produced by: Tochi Iroakazi
 Date: April 30,, 2019
 Made for: Unit 3-04
 This program prints out magic square when given an odd integer.
 */

import java.util.*;

public class MagicSquares {

    public static void main(String[] args) { 
    	System.out.println("how  many boxes do you want: ");
    	Scanner scanner = new Scanner (System.in);
    	if (scanner.hasNextInt()) {
    		int n = scanner.nextInt();
            if (n % 2 == 0) throw new RuntimeException("n must be odd");

            int[][] magic = new int[n][n];

            int row = n-1;
            int col = n/2;
            magic[row][col] = 1;

            for (int i = 2; i <= n*n; i++) {
                if (magic[(row + 1) % n][(col + 1) % n] == 0) {
                    row = (row + 1) % n;
                    col = (col + 1) % n;
                }
                else {
                    row = (row - 1 + n) % n;
                    // don't change col
                }
                magic[row][col] = i;
            }

            // print results
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (magic[i][j] < 10)  System.out.print(" ");  // for alignment
                    if (magic[i][j] < 100) System.out.print(" ");  // for alignment
                    System.out.print(magic[i][j] + " ");
                }
                System.out.println();
            }
    	}else {
    		System.out.println("Type in a valid number");
    	}
        

    }
}
