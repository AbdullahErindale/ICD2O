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
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        long n = 0;
        long amount;
        long largest = 0;
        char resp;
        do {
            System.out.print("Enter a value for n: ");
            n = kb.nextLong();
            System.out.print(n + "; ");
            while (n > 1) {
                largest = 0;
                if ( (n % 2) == 0 ) {
                    n = n / 2;
                    System.out.print(n + "; ");
                    if (n > largest) {
                        largest = n;
                    }
                }
                else {
                    n = 3 * n + 1;
                    System.out.print(n + "; ");
                    if (n > largest) {
                        largest = n;
                    }
                }
            }
            System.out.println("the largest number was " + largest);
            System.out.print("continue? (y/n)");
            resp = kb.next().toLowerCase().charAt(0);
        } while (resp == 'y');
            
    }
}
