/*
Abdullah 867292
Date: 13     January, 2025
Course: Grade 10 Comp Sci
Title: Final Assignment 
Description: Credit card balance calculator.
VARIABLE DICTIONARY: 
r   (double)
b   (double)
p   (double)
d   (double)
f   (double)
largest(double)
smallest(double)
resp    (char)
 */
package pkgfinal.assignment;
import java.util.Scanner;
/**
 *
 * @author 867292
 */
public class FinalAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declares the Scanner object
        Scanner kb = new Scanner(System.in);
        //Declaration for required variables
        double r = 0.28;
        double b;
        double p;
        double d;
        double f;
        char resp;
        double largest = -999;
        double smallest = 999;
        //To count the amount of customers
        int tally = 0;
        
        //Algorithm that calculates the balance for the user
        do {
            tally++;
            //Asks information to calculate the final balance
            System.out.print("What is your current balance: ");
            b = kb.nextDouble();
            System.out.print("How much is the purchase you want to make: ");
            p = kb.nextDouble();
            System.out.print("How much is the payment you will make: ");
            d = kb.nextDouble();
            f = (1+r/12)*b-d+p;
            System.out.printf("Your final balance will be %.2f \n", f);
            //if statments to figure out which balance will be the largest
            if (f > largest){
                largest = f;
            }
            if (f < smallest) {
                smallest = f;
            }
            
            System.out.print("Would you like to add another customer? (y/n)");
            resp = kb.next().toLowerCase().charAt(0);
        }while (resp == 'y');
        System.out.printf("The largest balance was %.2f and the smallest balance was %.2f \n", largest, smallest);
        System.out.printf("There were %s customers \n", tally);
    }
    
}
