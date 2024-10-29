import java.util.Scanner;

class U5 L6 {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    String greeting = new String();

    System.out.print("Hi. Please enter a greeting in one word: ");
    greeting = kbd.next();
    kbd.nextLine();
    System.out.printf("You said: %s.\n", greeting);
    System.out.print("Hi. Please enter a greeting in more than one word: ");
    greeting = kbd.nextLine();
    System.out.printf("You said: %s.\n", greeting);
  }
}
