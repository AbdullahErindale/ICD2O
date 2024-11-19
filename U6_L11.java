import java.util.Scanner;
import java.util.Random;

class U6_L11 {
   public static void main(String [] args) {
      long smiley = 0x1f600;
      String uChar = new String(Character.toChars((int) smiley));
      for (long x = smiley; x < (smiley + 80); x++) {
        uChar = new String(Character.toChars((int) x));
        System.out.printf("%4h\t%s\n", x, uChar);
      }
   }
}
