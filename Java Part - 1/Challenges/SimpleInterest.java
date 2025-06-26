import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome To Simple Interest Calculator\n");
            System.out.print("Enter Principal Amount USD: ");
            int principal = input.nextInt();
            System.out.print("Enter Rate of Interest %: ");
            float rate = input.nextFloat();
            System.out.print("Enter Time in Years: ");
            float time = input.nextFloat();
            double interest = (principal * rate * time) / 100;
            System.out.printf("Simple Interest is: $%.2f\n", interest);
        }
    }
}
