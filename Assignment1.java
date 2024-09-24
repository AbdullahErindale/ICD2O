/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author 867292
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //create scanner
        
        System.out.println("Enter the length and width of a rectangle and I will calculate the area");
        //tells use what to do
        
        System.out.print("Length: ");
        int L = scan.nextInt();
        //asks user the length and assigns it to var L
        
        System.out.print("Width: ");
        int W = scan.nextInt();
        //asks user the width and assigns it to var W
        
        int arearec = L * W;
        //does formula for the area of a rectangle
        
        System.out.println("Area of the rectangle is " + arearec);
        //prints the area of the rectangle
        
        System.out.println("Enter the radius of a circle and I will calculate the area");
        //tells use what to do
        
        System.out.print("Radius: ");
        int R = scan.nextInt();
        //asks user the radiues and assigns it to the var R
        
        
        int r = R * R;
        //does r^2 
        
        double areacirc = Math.PI * r;
        //does the rest of the formula
        
        System.out.println("Area of the circe is " + areacirc);
        //prints out the area of the circle out on the console
        
        System.out.println("Enter the height and raidius of a cylinder and I will calculate the surface"
                + " area and volume");
        
        System.out.print("Radius: ");
        int R2 =  scan.nextInt();
        //asks for the radies and assigns it to R2
        
        System.out.print("Height: ");
        int H = scan.nextInt();
        //asks for the height and assigns it to H
        
        int r2 = R2 * R2;
        //does r^2
        
        double V = Math.PI * r2 * H;
        //does the rest of the formula for volume
        
        System.out.println("Volume of the cylinder is " + V);
        //prints out the valume of the cylinder on the console
        
        double SA = 2 * Math.PI * R2 * H + 2 * Math.PI * r2;
        //does the formula for the surface area
        
        System.out.println("Surface area of the cylinder is " + SA);
        //prints out the surface area of the cyclinder out on the console
        
        System.out.println("Enter the length of a pendulum and I will calculate the period");
        
        double g = 9.8;
        //value of gravity
        
        System.out.print("Length: ");
        int L2 = scan.nextInt();
        //asks what the length is and assigns it to L2

        double L3 = L2 / g;
        //calculates division
        
        double L4 = Math.sqrt(L3);
        //calculates the square root
        
        double P = 2 * Math.PI * L4;
        //does formula for period
        
        System.out.println("Period of the pendulum is " + P);
    }
    
}
