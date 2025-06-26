import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Reverse The Digits Engine!");
            System.out.print("Please enter a numbers: ");
            int num = input.nextInt();
            int reversed = reverse(num);
            System.out.println("The reversed number is: " + reversed);
        }
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
