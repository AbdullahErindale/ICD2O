import java.lang.Math;

class U6_L8 {
    public static void main(String [] args) {
        System.out.println("x sqrt(x) x^2 x^3");
        for (int x = 0; x <= 10; x++) {
            double sr = Math.sqrt(x);
            double de = Math.pow(x, 2);
            double df = Math.pow(x, 3);
            System.out.printf("%d %.4f %.0f    %.0f\n", x, sr, de, df);
            
        }
    }
}
