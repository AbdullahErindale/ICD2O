import java.io.*;
import java.util.Scanner;

class U6_L6 {
  public static void main(String [] args) {
  	Scanner kb = new Scanner(System.in);
  	String choice = "a, b or c";
  	String a = "a";
  	String b = "b";
  	String c = "c";
  	boolean valid = false;
  	while (! valid) {
  		System.out.print("Choose a, b or c: ");
  		choice = kb.nextLine();
  		if (choice.compareTo(a) == 0) {
  		  valid = true;
  		}
  		if (choice.compareTo(b) == 0) {
  		  valid = true;
  		}
  		if (choice.compareTo(c) == 0) {
  		  valid = true;
  		}
  	}
  	System.out.printf("You chose: %s\n", choice);
  }
}
