import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Showcasing Bitwise And Operator");
            System.out.print("Please enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Please enter the second number: ");
            int num2 = input.nextInt();
            
            int result = num1 & num2;
            System.out.println("Result is: " + result);
        }
    }   
}
