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
        String fileName = "ledger.dat";
        double smallest = 999999;
        double largest = -999999;
        double r = 0.28;
        int tally = 0;
        try {
            Scanner fh = new Scanner(new File(fileName));
            while (fh.hasNext()){
                String data = fh.nextLine();
                System.out.println(data);
                String [] tokens = data.split("   ");
                //for (int i = 0; i < 4; i++) {
                    //System.out.println(tokens[i]);
                //}
                String u = tokens[0];
                System.out.printf("Your account number: %s \n", u);
                double x = Double.parseDouble(tokens[1]);
                System.out.printf("Your starting balance: %.2f \n", x);
                double y = Double.parseDouble(tokens[2]);
                System.out.printf("Your most recent purchase: %.2f \n", y);
                double z = Double.parseDouble(tokens[3]);
                System.out.printf("Your most recent payment: %.2f \n", z);
                //to find final balance
                double f = (1+r/12)*x-z+y;
                System.out.printf("Final balance = %.2f \n", f);
                tally++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.printf("There were %s customers \n", tally);
    }
    
}
