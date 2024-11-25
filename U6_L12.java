import java.lang.Math;

// Fix the errors in the code below to find the first 12
// numbers and their square roots to 4 decimals.

class U6_L12 {
    public static void main(String [] args) {
        int x = 0; 
        while (x <= 12) {
            double sr = Math.sqrt(x);
            System.out.printf("%d %.4f\n", x, sr);
            x++;
        }
    }
}
