import java.util.Scanner;
public class OddEvenBitWise {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Welcome to Odd Even Game!");
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            
            if ((num & 1) == 1) {
                System.out.println("The number is odd");
            } else {
                System.out.println("The number is even");
            }
        }
    } 
}
