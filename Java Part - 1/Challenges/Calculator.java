import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Welcome to out Calculator");
        System.out.print("Please enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println(" Sum of your number is:" + sum);
        
        // end
    }
        }  
}
