// -------------------------------------------------------
// Assignment 3
// Written by: Jolson Eric Cruz - 221 9359
// For “Programming Concepts I” Section 87411 and 01211 – Fall 2022
// Submitted on: November 15, 2022
// --------------------------------------------------------

package hw3;

public class PropertyDriver {
    
    public static void main(String[] args) {
        // Initialize objects
        Property property1 = new Property("7 Main St.", 1, 2, 2012, 1, 0.1f);
        Property property2 = new Property("20 Square St.", 2, 1, 2020, 1, 0.02f);
        Property property3 = new Property("65 Rue College", 3, 3, 1988, 2, 0.2f);
        Property property4 = new Property("110 Flowers Rd.", 1, 4, 1992, 2, 0.15f);
        
        // Print header and property1 using toString(), AnalyzeInvestment(), and EvaluatePrice() methods
        header();
        System.out.println(property1.toString());
        System.out.printf("\nInvestment Analysis: %.1f\n", property1.AnalyzeInvestment());
        System.out.printf("Evaluated Price: $%,.2f\n", property1.EvaluatePrice());
        
        // Print divider and property2 using toString(), AnalyzeInvestment(), and EvaluatePrice() methods
        divider(2);
        System.out.println(property2.toString());
        System.out.printf("\nInvestment Analysis: %.1f\n", property2.AnalyzeInvestment());
        System.out.printf("Evaluated Price: $%,.2f\n", property2.EvaluatePrice());
        
        // Print divider and property3 using toString(), AnalyzeInvestment(), and EvaluatePrice() methods
        divider(3);
        System.out.println(property3.toString());
        System.out.printf("\nInvestment Analysis: %.1f\n", property3.AnalyzeInvestment());
        System.out.printf("Evaluated Price: $%,.2f\n", property3.EvaluatePrice());
        
        // Print divider, footer and property4 using toString(), AnalyzeInvestment(), and EvaluatePrice() methods
        divider(4);
        System.out.println(property4.toString());
        System.out.printf("\nInvestment Analysis: %.1f\n", property4.AnalyzeInvestment());
        System.out.printf("Evaluated Price: $%,.2f\n", property4.EvaluatePrice()); 
        footer();
    }
    
    // Custom header method for pretty print
    private static void header(){
        System.out.println("=================================");
        System.out.println("     Welcome to ABC Analyzer     ");
        divider(1);
    }
    
    // Custom divider method for pretty print
    private static void divider(int num){
        System.out.println("=================================");
        System.out.println("Property " + num + ":");
    }
    
    // Custom footer method for pretty print
    private static void footer(){
        System.out.println("=================================");
        System.out.println("Thank you for using our software!");
        System.out.println("=================================");
    }
}
