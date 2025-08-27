/*
AP CS A
Name: Katherine Rivas
Date: Aug 27, 2025
Teacher: Ms. Gee
Assignment: Lesson 1.4 Notes
Description:
    * Based on the code to "copy" variables, write code
    * that swaps the value two int variables x and y.
    * Use java.util.Scanner to prompt values for int
    * variables x and y.
    * Hint: you might need to create new variable(s).
*/


public class Swap {
    public static void main(String[] args){

        int x = 0;
        int y = 1;
        System.out.println("Before swap x: " + x);
        System.out.println("Before swap y: " + y);
        
        System.out.println("Swapping...");

       int temp = y;
       y = x;
       x = temp;
        /* to be implemented */
        
        System.out.println("After swap x: " + x);
        System.out.println("After swap y: " + y);
    }
}
