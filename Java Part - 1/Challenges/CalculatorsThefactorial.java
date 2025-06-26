import java.util.Scanner;

public class CalculatorsThefactorial {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Calculator to Factorial!");
            System.out.print("Please enter a number to calculate the factorial: ");
            int num = input.nextInt(); // input number from user

            long fact = factorial(num);
            System.out.println("Factorial is: " + fact);
        }
    }
    public static long factorial(int num) {
        if (num < 2) {
            return 1;  // num jodi 2 theke choto hoy ta hole output 1
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
