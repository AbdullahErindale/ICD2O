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
        try {
            Scanner fh = new Scanner(new File(fileName));
            while (fh.hasNext()){
                String i = fh.nextLine();
                System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
