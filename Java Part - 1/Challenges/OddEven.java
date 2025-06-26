import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Odd even calculator!");
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("This number is Odd.");
            }
        }
    }
}
