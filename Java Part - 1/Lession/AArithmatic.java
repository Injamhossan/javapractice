import java.util.Scanner;

public class AArithmatic {
    public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Welcome to Arithmatic calcultator");
        System.out.print("Please enter the first number: ");
        int first = input.nextInt();
        System.out.print("Now, Please Enter sceond Numnber: ");
        int second = input.nextInt();
        
        int add = first + second;
        int subtract = first - second;
        int multiply = first * second;
        int divide = first / second;
        int mod = first % second;
        
        System.out.println ("Addition is: " + add);
        System.out.println ("Substraction is: " + subtract);
        System.out.println ("Multiplication is: " + multiply);
        System.out.println ("Division is: " + divide);
        System.out.println ("Modulus is: " + mod);

        }
    }
}
