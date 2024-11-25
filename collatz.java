// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = 0;
        System.out.println(n);
        
        while (n <= 1) {
            System.out.print("Enter a value for n: ");
             n = kb.nextInt();
            while (n > 1) {
                if ( (n % 2) == 0 ) {
                    n = n / 2;
                    System.out.println(n);
                }
                else {
                    n = 3 * n + 1;
                    System.out.println(n);
                }
            }
        }
    }
}
