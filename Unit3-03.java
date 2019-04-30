/**
 * Name: Tochi Iroakazi
 * Class: ICS4U
 * Description: This program searches for a number in an Arraylist and without using "search" and sorts the Arraylist without using "sort" and prints out the position of the number you are searching for.
 */


import java.util.*;
public class BinarySearchRecursive {
 public static void main(String[] args) {
	 //creating an empty stack
	  ArrayList<Integer> list = new ArrayList<Integer> ();
	  //add numbers into the array list
	  for(int i = 0;  i < 249; i++) {
	   Random generatenumber = new Random();
	   int randnumber = generatenumber.nextInt(500) + 1;
	   list.add(randnumber);
	  }
	  System.out.println("what number do u want to add the the list (1-500)?");
	  Scanner input = new Scanner(System.in);
	  int asked = input.nextInt();
	  //while the number asked for is greater than 500 or less than 1. keep asking for the number until you get a number within 1 and 500.
	  while ( asked >  500 || asked < 1) {
	   System.out.println("The number has to be between 1 and 500");
	   System.out.println("Try Again, what number do u want to add the the list (1-500)?");
	   asked = input.nextInt();
	  }
	  // add the number asked for to the loop.
	  list.add(asked);
	  //int size = list.size()-1;
	 
	  //print out the numbers in the array list
	  System.out.println(list);
	  System.out.println("there are " + list.size() + " numbers in the array list. ");
	  System.out.println();
	 
	  // sort the numbers 
	  for (int j = 0; j < list.size()-1; j++) {
	   //get the first 2 consecutive numbers and sort them. Then move to the next two consecutive numbers
	   if (list.get(j) > list.get(j+1)) {
	    int move = list.get(j);
	    list.set(j,list.get(j+1));
	    list.set(j+1,move);
	    j = -1;
	   }
	  }
	  System.out.println("new sorted list is:");
	  System.out.println(list);
	 
	  //defining the first, middle and the last numbers in the arraylist
	  int first = 0;
	  int last = list.size() - 1;
	  int middle = (first + last) / 2;
	  int counter = 0;
	  
	//ask fro what number to search for
	  System.out.println("What number would you want to search for ?");
	  Scanner searchinput = new Scanner(System.in);
	  int searchnumber = searchinput.nextInt();
	  // while the number searched for is not within the range. Ask again for the number.
	  while ( searchnumber < list.get(0) || searchnumber > list.get(list.size() - 1)){
	  
	   System.out.println("The number you searched for is not within the range of the arraylist");
	   System.out.println("Try Again,  What number would you want to search for ?");
	   searchnumber = searchinput.nextInt();
	  } 
	  
	 Search (list, first, last, middle, counter, searchnumber);
 }
 
 
 
 public static void Search (ArrayList<Integer> array, int top, int bottom, int centre, int count, int search){
	
 
  //the binary search with recursion
  if ( search == array.get(centre) ) {
      System.out.println("the position of the number is " + (centre + 1) );
  
     }else if (search == array.get(top)) {
      System.out.println("the position of the number is " + (top + 1) );
  
     }else if (search == array.get(bottom)) {
      System.out.println("the position of the number is " + (bottom + 1) );

     }else if (search > array.get(centre) && search < array.get(bottom)) { 
      top = centre + 1;
     centre = (top + bottom) / 2;
     count++;
      Search( array, top, bottom, centre, count, search);
     }else if (search < array.get(centre) && search > array.get(top)){
      bottom = centre - 1;
      centre = (top + bottom) / 2;
      count++;
      Search( array, top, bottom, centre, count, search);
     }else {
      System.out.println("the number is not in the arraylist");
     } 
  
 
 }
}



