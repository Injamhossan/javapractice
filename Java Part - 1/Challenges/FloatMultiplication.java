import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        
        System.out.println("We are done Float Multiplication\n");
        System.out.println ("Enter the first Decimle Number: ");
        double first = input.nextDouble();
        System.out.println("Now, Please Enter Second Decimal Number: ");
        double second = input.nextDouble();

        double mul = first * second;
        System.out.println("\nResult is: " + mul);
        }
    }
}

