/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
import java.util.Scanner;
/**
 *
 * @author 867292
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declares scanner
        Scanner kb = new Scanner(System.in);
        //Declares variable min and max to use in random number generator
        int min = 1;
        int max = 3;
        //n is used for the random generator
        double n = 0;
        //input is the use input and output is the computer
        char output = 0;
        char input = 0;
        //resp is to check if the user wants to play again
        char resp = 0;
        //counter1 counts the computers wins, counter2 counts users wins
        int counter1 = 0;
        int counter2 = 0;
        //actual rock paper scissors game
        do {
            //prints and scans user response and assigns it to input by converting it to a char
            System.out.print("Lets play rock paper scissors. \nPick s for scissors, p for paper, r for rock: ");
            input = kb.next().charAt(0);
            //Random number generator
            for (int i = 0; i < 10; i++) {
                n = (int) (max * Math.random()) + min;
            }
            //if n = 1 is will be scissors if its 2 it will be paper if it is 3 it will be rock
            if (n == 1){
                output = 's';
            }
            if (n == 2){
                output = 'p';
            }
            if (n == 3){
                output = 'r';
            }
            //Prints output of the computers choice
            System.out.println(output);
            //These if statements see who wins by checking if they fit these then add to counter
            if ((output == 's') && (input == 'p')){
                System.out.println("I win!");
                counter1++;
                System.out.printf("The score is %d %d!", counter1, counter2);
            }
            if ((output == 's') && (input == 'r')){
                System.out.println("You win!");
                counter2++;
                System.out.printf("The score is %d %d!", counter1, counter2);
            }
            if ((output == 'p') && (input == 's')){
                System.out.println("You win!");
                counter2++;
                System.out.printf("The score is %d %d!", counter1, counter2);
            } 
            if ((output == 'p') && (input == 'r')){
                counter1++;
            }
            if ((output == 'r') && (input == 'p')){
                System.out.println("You win!");
                counter2++;
                System.out.printf("The score is %d %d!", counter1, counter2);
            } 
            if ((output == 'r') && (input == 's')){
                System.out.println("I win!");
                counter1++;
                System.out.printf("The score is %d %d!", counter1, counter2);
            } 
            if ((output == 's') && (input == 's')){
                System.out.println("It's a tie!");
            } 
            if ((output == 'p') && (input == 'p')){
                System.out.println("It's a tie!");
                System.out.printf("The score is %d %d!", counter1, counter2);
            }
            if ((output == 'r') && (input == 'r')){
                System.out.println("It's a tie!");
                System.out.printf("The score is %d"+", "+"%d!", counter1, counter2);
            }
            //asks to go again and assigns answer to y
            System.out.print("\nGo again?(y/n): ");
            resp = kb.next().charAt(0);
        }while (resp == 'y');
    }
}
