/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author 867292
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creates a scanner object
        Scanner kb = new Scanner(System.in);
        //creates n and other required variables
        long n = 0;
        long amount = 0;
        long largest = 0;
        char resp;
        //actual collatz conjecture
        do {
            //resets variable largest to 0
            largest = 0;
            //Asks for a value to use for n and assigns it to n
            System.out.print("Enter a value for n: ");
            n = kb.nextLong();
            System.out.printf("%,d; ", n);
            //while loop so that the loop doesn't go on infinitely
            while (n > 1) {
                //checks if n is even or odd and acts accordingly
                if ( (n % 2) == 0 ) {
                    n = n / 2;
                    System.out.printf("%,d; ", n);
                }
                else {
                    n = 3 * n + 1;
                    System.out.printf("%,d; ", n);
                }
                //this if statement finds out which number is the largest 
                if (n > largest) {
                    largest = n;
                }
                //adds 1 to amount to count how many numbers are being printed
                if (n >= 1) {
                amount++;
                }
            }
            amount++;
            //prints largest number and amount of numbers then asks to continue while response is y
            System.out.printf("\nthe largest number was %,d", largest);
            System.out.printf("\nthere were %,d terms printed", amount);
            System.out.print("\ncontinue? (y/n)");
            resp = kb.next().toLowerCase().charAt(0);
        } while (resp == 'y');
    }
}
