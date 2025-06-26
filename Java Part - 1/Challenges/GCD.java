import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to GCD!"); // Greatest Common Divisor
            System.out.print("Enter first number: ");
            int first = input.nextInt();
            System.out.print("Enter second number: ");
            int second = input.nextInt();
            int gcd = gcd(first, second);
            System.out.println("GCD of the number is: " + gcd); // Main result aita run korb
        }
    }

    public static int gcd(int num1, int num2) { //GCD int diye declear korci 
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2) {  // least diye int ekta declear korci
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}