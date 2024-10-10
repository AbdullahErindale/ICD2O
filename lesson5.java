import java.util.Scanner;


class lesson5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        int yr;
        System.out.print("What is your age: ");
        age = scan.nextInt();
        System.out.print("What year were you born: ");
        yr = scan.nextInt();
        
        int yr2 = yr * 2 + 5;
        System.out.println(yr2);
        int yr3 = yr2 * 50 + age;
        System.out.println(yr3);
        int yr4 = yr3 - 250;
        System.out.println(yr4);
        int yr5 = yr4 / 100;
        
        System.out.print(yr5);
    }
}
