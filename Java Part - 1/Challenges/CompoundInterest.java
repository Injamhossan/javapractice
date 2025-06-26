import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to the Compound Interest Calculator!");
            System.out.print("Enter the principal amount: ");
            double principal = input.nextDouble();
            System.out.print("Enter the annual interest rate (in %): ");
            float rate = input.nextFloat();
            System.out.print("Enter the number of years: ");
            int years = input.nextInt();

            double compInt = principal * Math.pow((1 + rate / 100), years);
            System.out.printf("The compound interest is: $%.2f%n", compInt);
        } 
    }

} 
