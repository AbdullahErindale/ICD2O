// any import statements go here!
import java.util.Scanner;

public class U6_L2 {
    public static void main(String[] args) {
        // Your code goes here!
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give me 2 numbers");
        System.out.print("Number 1:");
        double num1 = scan.nextInt();
        System.out.print("Number 2");
        double num2 = scan.nextInt();
        double num3 = num1 + num2;
        System.out.println("The product of the 2 numbers is " + num3);
        // Yout code stops here!
    }
}
