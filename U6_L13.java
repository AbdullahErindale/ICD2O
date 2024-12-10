import java.util.Scanner;

class U6_L13 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        // declare variables
        int tracks = 0;
        double totalMinutes = 0.0;
        double minutes = 0.0;

        // INPUT
        System.out.print("How many tracks? : ");
        tracks = Integer.parseInt(kbd.nextLine());

        // INPUT PROCESS OUTPUT loop
        for (int i = 0; i < tracks; i++) {
          System.out.print("How many minutes for track " + (i + 1) + ": ");
          minutes = Double.parseDouble(kbd.nextLine());
          totalMinutes += minutes; // accumulate total minutes
        }

       
        System.out.println("Total running time: " + totalMinutes);

       
        kbd.close();
    }
} 
