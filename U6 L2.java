import java.util.Scanner;

class U6 L2 {
   public static void main(String [] args) {
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      double a = kb.nextDouble();
      System.out.print("Enter another number: ");
      double b = kb.nextDouble();
      System.out.print("Enter an operator +, -, *, /: ");
      char c = kb.next().charAt(0);
      
      if (c == '+') {
        System.out.println(a + b);
      } else if (c == '-') {
        System.out.println(a - b);
      } else if (c == '*') {
        System.out.println(a * b);
      } else if (c == '/') {
        System.out.println(a / b);
      }
   }
}
