/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 867292
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        long n = 0;
        long amount = 0;
        long largest = 0;
        char resp;
        do {
            largest = 0;
            System.out.print("Enter a value for n: ");
            n = kb.nextLong();
            System.out.printf("%,d; ", n);
            while (n > 1) {
                if ( (n % 2) == 0 ) {
                    n = n / 2;
                    System.out.printf("%,d; ", n);
                }
                else {
                    n = 3 * n + 1;
                    System.out.printf("%,d; ", n);
                }
                if (n > largest) {
                    largest = n;
                }
                if (n >= 1) {
                amount++;
                }
            }
            amount++;
            System.out.printf("\nthe largest number was %,d", largest);
            System.out.printf("\nthere were %,d terms printed", amount);
            System.out.print("\ncontinue? (y/n)");
            resp = kb.next().toLowerCase().charAt(0);
        } while (resp == 'y');
    }
}
