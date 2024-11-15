import java.util.Scanner;

class U6_L5 {
   public static void main(String [] args) {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = kb.nextInt();
      int fac = 1;
      while (n <= 4) {
          fac = fac * n;
          n++;
      }
      System.out.println("Answer = " + fac);
   }
}
