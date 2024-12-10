package NewClass;
import java.util.Scanner;
import java.io.*;

class U6_L14 {
   public static void main(String [] args) {
      int hi = -1;
      int lo = 999;
      int n = 0;
      try {
        File myobj = new File("numlist.txt");
        Scanner fh = new Scanner(myobj);
        while (fh.hasNextInt()) {
           n = fh.nextInt();
           if (n > hi) {
               hi = n;
           }
           if (n < lo) {
               lo = n;
           }
        }
        fh.close(); // close the file
        // output "highest number is: ---"
        // output "lowest number is: ---"
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
   }
}
