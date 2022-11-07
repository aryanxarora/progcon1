import java.util.Scanner;
import java.io.IOException;

// -------------------------------------------------------
// Assignment 2
// Written by: Aryan Arora 2219549
// For “Programming Concepts I” Section 87411 and 01211– Fall 2022
// --------------------------------------------------------


public class assignment2 {
  
  static void clear (Scanner sc)
    {
      System.out.println ("Press \"ENTER\" to continue...");
      try
      {
        int read = System.in.read (new byte[2]);
      } catch (IOException e)
      {
        e.printStackTrace ();
      }
      System.out.print ("\033[H\033[2J");
      System.out.flush ();
    }

  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println ("Enter name: ");
    String user_name = sc.next ();
    System.out.printf("\nHello %s!\nWelcome to Assignment 1 for Programming Concepts 1\n",user_name);
    clear (sc);

    // THE FOLLOWING PROGRAM TAKES IN A USER INPUT WHICH NEEDS TO BE TURNED INTO A PASSWORD
    // THE PROGRAM RUNS IN AN ENDLESS LOOP WITH AN EXIT INPUT "NO"
    // ONCE THE USER HAS ENTERED AN INPUT THE PROGRAM USES A FOR LOOP TO TRAVERSE THE STRING
    // FOR EACH CHARACTER OF THE STRING, THE PROGRAM DETERMINES A SUBSTITUTE
    // USING IF CONDITIONS, THE PROGRAM DETERMINES WHAT CHARACTER TO REPLACE WITH A NEW CHAR

    System.out.println ("????????????????????????????????????");
    System.out.println ("          Password Generator        ");
    System.out.println ("????????????????????????????????????\n\n");
    
    while(true){
      System.out.println("Enter a word (NO to stop): ");
      String input = sc.nextLine();
      if (input.equalsIgnoreCase("NO") == true){
        System.out.println("Thank you for using our program.");
        break;
      } else {
        System.out.print("\nThe generated password for " + input + " is ");
        for (int i = 0; i < input.length(); i++){
          if(input.charAt(i) == 'a' || input.charAt(i) == 'b' || input.charAt(i) == 'c' || input.charAt(i) == 'd'){
            System.out.print('#');
          } else if (input.charAt(i) == 'e' || input.charAt(i) == 'f' || input.charAt(i) == 'g' || input.charAt(i) == 'h'){
            System.out.print('@');
          } else if (input.charAt(i) == 'i' || input.charAt(i) == 'j' || input.charAt(i) == 'k' || input.charAt(i) == 'l'){
            System.out.print('?');
          } else if (input.charAt(i) == 'm' || input.charAt(i) == 'n' || input.charAt(i) == 'o' || input.charAt(i) == 'p'){
            System.out.print('%');
          } else if (input.charAt(i) == 'q' || input.charAt(i) == 'r' || input.charAt(i) == 's' || input.charAt(i) == 't'){
            System.out.print('&');
          } else if (input.charAt(i) == 'u' || input.charAt(i) == 'v' || input.charAt(i) == 'w' || input.charAt(i) == 'x'){
            System.out.print('$');
          } else if (input.charAt(i) == 'y' || input.charAt(i) == 'z'){
            System.out.print('!');
          } else if ((int)input.charAt(i) >= 48 && (int)input.charAt(i) <= 57){
            System.out.print(input.charAt(i));
          } else {
            System.out.print('*');
          }

        }
        System.out.println("\n");
      }

    }

    clear(sc);

    // THE FOLLOWING PROGRAM IS A PATTERN GENERATOR
    // THE USER IS ASKED IF THEY WANT TO PRINT A SQUARE OR TRAINGLE AND THE SIZE OF THE SHAPE
    // ONCE THE USER HAS CHOSEN
    // A NESTED FOR LOOP IS USED TO CREATE THE CHOSEN PATTERN

    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    System.out.println("     Welcome to word Generator Program     ");
    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
    System.out.println("Choose an item from the following list:");
    System.out.println("-------------------------------------------");
    System.out.println("\t 1 - Square");
    System.out.println("\t 2 - Triangle");
    System.out.println("\t 3 - Quit\n");
    System.out.println("Please enter your choice: ");
    int choice = sc.nextInt();
    String shape = "";
    while (choice < 1 || choice > 3){
      System.out.println("Invalid Choice!!! Try again: ");
      choice = sc.nextInt();
    }
    if(choice == 1){
      shape = "Square";
    } else if (choice == 2){
      shape = "Triangle";
    } else if (choice == 3){
      System.out.println("See you next time!");
      System.exit(0);
    }

    System.out.println("You have entered " + choice + " for " + shape);
    System.out.println("Please enter the length of the side: ");
    int length = sc.nextInt();
    if (choice == 1){
      for (int i = 1; i <= length; i++) {
        for (int j = 1; j <= length; j++) {
            if (i == j || j == length - i + 1) {
                if (j == length - i + 1) {
                    System.out.print(" / ");
                } else {
                    System.out.print(" \\ ");
                }

            } else {
                System.out.print(" * ");
            }
        }
        System.out.println();
      }
    } else if (choice == 2){
      for (int i = 0; i < length; i++) {
        for (int j = 0; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println("");
      }
    }
  }
}