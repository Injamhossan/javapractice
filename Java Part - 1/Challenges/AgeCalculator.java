import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Age Calculator!");
            System.out.print("Enter your age: ");
            int age = input.nextInt();

            if (age >= 65) {
                System.out.println("You are a senior citizen.");
            } else if (age >= 20) {
                System.out.println("You are Adult.");
            } else if (age >= 13) {
                System.out.println("You are a Teeneger");   
            } else {
                System.out.println("You are a Kid");
            }
        }
    }
}