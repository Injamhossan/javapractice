import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Bitwise OR.");
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = input.nextInt(); 

            int result =  num1 | num2;
            System.out.println("The result of the bitwise OR operation is: " + result);
        }
    }
}
