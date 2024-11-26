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
        long n = 2;
        long amount = 0;
        long largest = 0;
        System.out.println(n);
        
        while (n >= 1) {
            System.out.print("\nEnter a value for n: ");
             n = kb.nextInt();
            while (n > 1) {
                if ( (n % 2) == 0 ) {
                    n = n / 2;
                    System.out.print(n + "; ");
                }
                else {
                    n = 3 * n + 1;
                    System.out.print(n + "; ");
                }
                if (n > largest) {
                    largest = n;
                }
            }
            
        }
    }
    
}
