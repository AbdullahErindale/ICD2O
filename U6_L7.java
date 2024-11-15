import java.util.Scanner;
import java.util.Random;

class U6_L7 {
   public static void main(String [] args) {
      Scanner kb = new Scanner(System.in);
      Random r = new Random();
      System.out.print("Enter a number: ");
      boolean valid = false;
      int answer = r.nextInt(10)+1;
      while (! valid) {
          System.out.print("Guess a number between 1 - 10: ");
          int guess = kb.nextInt();
          if ((guess >= 1) && (guess <= 10)) {
            if (guess == answer) {
              valid = true;
            }
          }
          if((guess < 1) || (guess > 10)) {
            System.out.println("Incorrect, try again");
          }
      }
      System.out.println("Correct");
   }
}
