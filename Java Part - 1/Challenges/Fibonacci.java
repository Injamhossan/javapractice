import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Fibonacci Series!");
            System.out.print("Enter the number of terms you want in the series: ");
            int first = input.nextInt();
            System.out.println("Here is the Fiboncci Series.");
            printFibonacci(first);
        }
    }

    public static void printFibonacci(int num) {
        if (num < 0)
            return;
        System.out.print("0");
        if (num == 0)
            return;

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }
    }
}
