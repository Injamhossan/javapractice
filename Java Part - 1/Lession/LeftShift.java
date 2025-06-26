 import java.util.Scanner;
 
public class LeftShift {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welocome to Left Shift Program.");
            System.out.print("Enter the number: ");
            int num = input.nextInt();

            int result = num >> 2; 
            System.out.println("This result is: " + result);
        }
    }
}