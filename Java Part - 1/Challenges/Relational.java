import java.util.Scanner;

public class Relational {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Driving License Portal");
            System.out.print("Please Enter your age: ");
            int age = input.nextInt();
            
            if (age>= 18) {
                System.out.println("You are Eligible to drive.");
            } else {
                System.out.println("You are not Eligible to drive.");
            }
        }
    }
}
