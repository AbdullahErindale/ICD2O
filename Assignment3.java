/*
Abdullah 867292
Date: 9 January, 2025
Course: Grade 10 Comp Sci
Title: Assignment3 
Description: Rock paper scissors game against computer.
VARIABLE DICTIONARY: 
  min     (int) keeps the random number generator at a min value of 1
  max     (int) keeps the random number generator at a max value of 3
  n       (double) used to make random number generator
  input   (char) what the user inputs
  output  (char) the computers output
  counter1(int) counts how many wins from the computer
  counter2(int) counts how many wins from the user
 */
package assignment3;
//importing required libraries
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author 867292 
*/
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates scanner
        Scanner kb = new Scanner(System.in);
        //creates required variables
        int min = 1;
        int max = 3;
        double n = 0;
        char output = 0;
        char input = 0;
        char resp = 0;
        int counter1 = 0;
        int counter2 = 0;
        //do loop
        do {
            //beginning fo the loop
            System.out.print("Lets play rock paper scissors. \nPick s for scissors, p for paper, r for rock: ");
            //assigns user response to input
            input = kb.next().charAt(0);
            //random number generator
            for (int i = 0; i < 10; i++) {
                n = (int) (max * Math.random()) + min;
            }
            //if loops to choose which choice the computer will choose
            if (n == 1){
                output = 's';
            }
            if (n == 2){
                output = 'p';
            }
            if (n == 3){
                output = 'r';
            }
            //calculates who wins depending on the choices and adds to counter depending on who wins
            System.out.println(output);
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
            //code to ask for another round
            System.out.print("\nGo again?(y/n): ");
            resp = kb.next().charAt(0);
        }while (resp == 'y');
      //end of do loop
    }
}
