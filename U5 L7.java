import java.util.Scanner;

public class U5 L7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); //open for keyboard input
        System.out.print("Enter an integer: ");

        try {
            double a = kb.nextInt();
            System.out.println("You entered: " + a);
            System.out.print("Enter an integer: ");
            double b = kb.nextInt();
            System.out.println("You entered: " + b);
            if (b == 0) {
              System.out.println("Cannot divide by 0");
            }
            else {
              double c = a/b;
            System.out.println("Num 1/Num 2 = " + c);
            }
            
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }  

        
        
        kb.close();
    }
}
