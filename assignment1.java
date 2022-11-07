// -------------------------------------------------------
// Assignment 1
// Written by: Aryan Arora - 2219549
// For “Programming Concepts I” Section 87411 and 01211 – Fall 2022 
// -------------------------------------------------------- 

import java.util.Scanner;
import java.io.IOException;

public class assignment1
{

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

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter name: ");
    String user_name = sc.next ();
    System.out.
      printf
      ("\nHello %s!\nWelcome to Assignment 1 for Programming Concepts 1\n",
       user_name);
    clear (sc);

    System.out.println ("Problem 1\n");
    // Problem 1 requets to print a diamond shape ascii art pattern. This problem was solved by printing the ascii art in a single println statement with the help of \n new line Character. Additionally, in order to print the back slash (\) there needs to be another \ for the compiler to be able to process it as a string.
    System.out.
      println
      ("  \\/  \n  --  \n \\\\// \n >><< \n\\\\\\///\n<<<>>>\n///\\\\\\\n >><< \n //\\\\ \n  --  \n  /\\  \n");
    clear (sc);

    System.out.println ("Problem 2\n");
    // Problem 2 requests to calculate the result of a formula using three inputs a, b, n. These values are then used to find c. Once all values are obtained, they are substituted in the formula r=(K%n)c to output the final result.
    System.out.println ("Hello dear scientist.");
    System.out.println ("\nPlease enter the following values:");
    System.out.println ("a:");
    int a = sc.nextInt ();
    System.out.println ("b:");
    int b = sc.nextInt ();
    System.out.println ("n:");
    int n = sc.nextInt ();
    int K = 50;
    int c = (a * a) + (b * b) + (2 * a * b);
    int result = (K % n) * c;
    System.out.printf ("\nOutput is: %d\n", result);
    clear (sc);

    System.out.println ("Problem 3");
    // Problem 3 requests an encrypted version of the input string with the help of string manipulation. Where the word is modified based on the given instructions.
    System.out.println ("Enter word to encrypt: ");
    String word, word2;
    word = sc.next ();
    int word_len = word.length();
    word2 = word.charAt(word_len-1) + word.substring(1,word_len-1) + word.substring(1,2);
    word2 = word2.substring(0,1) + "***" + word2.substring(word_len-1);
    word2 = word2 + word.substring(1, word_len-1);
    
    System.out.println(word2);

    System.out.println ("\nThank you! Exiting Program...");
  }
}
