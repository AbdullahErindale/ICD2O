import java.util.Scanner;

class U6 L7 {
   public static void main(String [] args) {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter a number: ");
      boolean valid = false;
      int answer = 5;
      while (! valid) {
          System.out.print("Guess a number between 1 - 10: ");
          int guess = kb.nextInt();
          if ((guess >= 1) && (guess <= 10)) {
            if (guess == answer) {
              valid = true;
            }
          }
      }
      System.out.println("Correct");
   }
}
