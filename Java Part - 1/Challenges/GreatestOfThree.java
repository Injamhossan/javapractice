import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("welcome to the World of Three\n");
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = input.nextInt();
            
            if (num1 >= num2 && num1 >=num3) {
                System.out.println(num1 + " is the greatest number");
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println(num2 + " is the greatest number");
            } else {
                System.out.println(num3 + " is the greatest number");
            }

        }
    }

}
