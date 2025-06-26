import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Welcome to the Prime Number Checker!");
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            boolean isprime = isprime(num);
            if (isprime) {
                System.out.println("Your numberis Prime");
            } else {
                System.out.println("Your number is not Prime");
            }
        }
    }

    public static boolean isprime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
