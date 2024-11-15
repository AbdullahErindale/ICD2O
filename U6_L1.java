import java.util.Scanner;

class U6_L1 {
 public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("What is the chance to rain (enter in decimal form): ");
    double chance = kb.nextDouble();
    double rain = 0.6;
    double no_rain = 0.07;
    
    if (chance >= rain) {
      System.out.println("The forecast is rain");
    } else if (chance <= no_rain){
      System.out.println("It will be dry");
    } else if ((chance <= rain) && (chance >= no_rain)){
      System.out.println("There is a a small chance of rain");
    }
 }
}
