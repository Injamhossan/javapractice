import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Grade Calculator!\n");
            System.out.print("Please enter your Percentage: ");
            float percentage = input.nextFloat();

            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 75) {
                System.out.println("Grade: B");
            } else if (percentage >= 60) {
                System.out.println("Grade: C");
            } else if (percentage >= 40) {
                System.out.println("Grade: D");
            } else {
                System.out.println("You are Fail");
            }
        }
    }
}
