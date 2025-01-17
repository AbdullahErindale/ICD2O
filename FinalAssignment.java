/*
Abdullah 867292
Date: 17 January, 2025
Course: Grade 10 Comp Sci
Title: Final Assignment 
Description: Credit card balance calculator.
VARIABLE DICTIONARY: 
r   (double) interest rate
tally (int) keeps track of customers
largest(double) which final balance was the largest
smallest(double) which final balance was the smallest
x       (double) beginning balance
y       (double) purchase value
z       (double) payment value
u       (string) user number
f       (double) final balance
total   (double) sum of all final balances
average (double) average of final balances
 */
package pkgfinal.assignment;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author 867292
 */
public class FinalAssignment {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = "ledger.dat";//declaring ledger.dat as fileName
        double smallest = 999999;//variable to keep track of which balance is going to be the smallest
        double largest = -999999;//variable to keep track of which balance is going the be the largest
        double r = 0.28;//the interest rate
        int tally = 0;//keeping track of how many customers are there
        double total = 0; // sum of all final balances
        try {//beginning of actual algorithm
            Scanner fh = new Scanner(new File(fileName));//scanner declared and file opened
            while (fh.hasNext()){//while the scanner is scanning the file and there is more to scan this loop will continue scanning those lines
                String data = fh.nextLine();//assigns the data of one line of the ledger file to variable data
                System.out.println(data);//prints out the line
                String [] tokens = data.split("   ");//array to split up the different parts of the line
                String u = tokens[0];//tokens[0] is the first bit of text which is the account number, it gets assigned to u
                System.out.printf(" Your account number: %s \n", u);//prints account number
                double x = Double.parseDouble(tokens[1]);//turns the beginning balance and turns it into a double
                System.out.printf(" Your starting balance: %.2f \n", x);//prints x which is now a double
                double y = Double.parseDouble(tokens[2]);//turned into double this is the purchase the customer made
                System.out.printf(" Your most recent purchase: %.2f \n", y);//prints the new double y
                double z = Double.parseDouble(tokens[3]);//turned into a double this is the payment the customer made
                System.out.printf(" Your most recent payment: %.2f \n", z);//prints the variable z
                //to find final balance
                double f = (1+r/12)*x-z+y;//calculates final balance using the given formula and assigns the value to f
                total += f; // add the final balance to total
                if (largest < f) {//this if statement figures out which one of the final balances is the largest
                    largest = f;//if the value f is bigger than largest then largest = f making it the new largest
                }
                if (smallest > f) {//figures out which final balance is the smallest
                    smallest = f;//if f is smaller than smallest than smallest = f making it the new smallest
                }
                System.out.printf(" Final balance = %.2f \n", f);//prints out the final balance
                tally++;//adds 1 to tally as a customer has been completed
            }
        } catch (Exception e){//if the file is not found then this catch statement comes into play
            System.out.println(e.getMessage());
        }
        System.out.printf("There were %s customers \n", tally);//after all the customer's final balance is calculated this will print how many customers there were
        System.out.printf("The largest balance is %.2f and the smallest is %.2f \n", largest, smallest);//prints which balance was the largest and smallest
        if (tally > 0) {
            double average = total / tally; // calculate the average
            System.out.printf("The average balance is %.2f \n", average);//prints the average of all final balances
        } else {
            System.out.println("No valid customers to calculate an average.");
        }
    }
}
