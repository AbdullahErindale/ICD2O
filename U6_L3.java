import java.util.Scanner;

class U6_L3 {
   public static void main(String [] args) {
      // enter your code here!
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter a percentage mark (0 - 100): ");
      int grade = kb.nextInt();
      
      if ((grade >= 0) && (grade <= 49)) {
        System.out.println(grade + " is a letter grade of F");
      } else if ((grade >= 50) && (grade <= 59)) {
        System.out.println(grade + " is a letter grade of D");
      } else if ((grade >= 60) && (grade <= 69)) {
        System.out.println(grade + " is a letter grade of C");
      } else if ((grade >= 70) && (grade <= 79)) {
        System.out.println(grade + " is a letter grade of B");
      } else if ((grade >= 80) && (grade <= 100)) {
        System.out.println(grade + " is a letter grade of A");
      }
   }
}
