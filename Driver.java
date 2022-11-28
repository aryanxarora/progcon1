// -------------------------------------------------------
// Assignment 4
// Written by: Aryan Arora 2219549
// For “Programming Concepts I” Section 87411 and 01211– Fall 2022
// --------------------------------------------------------

package assignment4;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("         Welcome to Athlete Evaluation Software");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Choose the display format:");
        System.out.println("===========================");
        System.out.println("      1 - Column Format");
        System.out.println("      2 - Histogram");
        System.out.println("      3 - Both");
        System.out.println("      4 - Quit");
        System.out.println("===========================");
        System.out.println("\nPlease enter your choice:");
        int choice = sc.nextInt();
        while(choice > 4 || choice < 1){
            System.out.println("Invalid choice!!! Try again: ");
            choice = sc.nextInt();
        }
        
        while(true){
            if(choice == 4){
                System.out.println("\nSee you next time!");
                System.exit(0);
            }
            else {
                System.out.println("Program successful!");
            }
        }
    }
    
}
