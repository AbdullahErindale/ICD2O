import java.io.*;
import java.util.Scanner;

class U8_L4 {
  public static void main(String [] args) {
    Scanner kb = new Scanner(System.in);
    String choice = "0";
    String a = "a";
    String b = "b";
    boolean valid = false;
    while (! valid) {
        System.out.print("Choose a, b or c: ");
        choice = kb.nextLine();
        valid = ((choice == a) || (choice == b));
        if (valid = true) {
          System.out.println("You chose: " + choice);
        }
    }
  }
}
