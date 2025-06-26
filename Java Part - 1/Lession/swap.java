import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Swapping Station");
            System.out.println("Enter the first value A: ");
            int a = input.nextInt();
            System.out.println("Enter the second value B: ");
            int b = input.nextInt();

            int c = a;
            a = b;
            b = c;

            System.out.println("Swapping Done......");
            System.out.println("Value of A is: " + a);
            System.out.println("Value of B is: " + b);
        }
    }
}
