import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Ticket Discount Calculator");
            System.out.print("Please Enter Your Age: ");
            int age = input.nextInt();
            System.out.print("Are You a female? (true/false)");
            boolean isFemale = input.nextBoolean();

            if (age < 5) {
                System.out.println("You got 75% Discount");
            } else if (isFemale){
                System.out.println("You got 50% Discount");
            } else if (age > 60 && !isFemale) {
                System.out.println("You got no Discount");
            }
        }
    }
}
