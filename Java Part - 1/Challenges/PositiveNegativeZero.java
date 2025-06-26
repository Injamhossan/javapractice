import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Welcome to Number Chacker \n");
            System.out.print("Enter your number: ");
            int num = input.nextInt();

            if (num > 0){
                System.out.println("Your Number is Positive");
            } else if (num == 0){
                System.out.println("Your Number is Zero");
            } else {
                System.out.println("Your Number is Negative");
            }
        }
    }
}
