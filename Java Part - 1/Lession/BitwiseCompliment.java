import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welocome to BitWise Compliment.");
            System.out.print("Enter the number: ");
            int num = input.nextInt();


            int result = ~num; 
            System.out.println("This result is: " + result);
        }
    }
}
