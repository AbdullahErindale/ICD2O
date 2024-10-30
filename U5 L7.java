import java.util.Scanner;

public class U5 L7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); //open for keyboard input
        System.out.print("Enter an integer: ");
        double a = kb.nextInt();
        System.out.print("Enter an integer: ");
        double b = kb.nextInt();
        try {
            System.out.println("You entered: " + a);
            System.out.println("You entered: " + b);
            double c = a/b;
            System.out.println(c);
          
            
        } catch (ArithmeticException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
          }
        
        
        kb.close();
    }
}
