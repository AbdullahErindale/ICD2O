import java.util.Scanner;

class U8 L1 {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Please enter an integer: ");
   int number = sc.nextInt();
   boolean done;
   
   if (number < 10) {
     System.out.println(number + " has 1 digits.");
   } else if (number < 100) {
     System.out.println(number + " has 2 digits.");
   } else if (number < 1000) {
     System.out.println(number + " has 3 digit.");
   } else {
     System.out.println(number + " has 4 or more digits.");
   }
 }
}