import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to PalinDrome Number Sector!");
            System.out.print("Enter The Number:");
            int num = input.nextInt();
            boolean isPalindrome = isPalindrome(num);
            if (isPalindrome) {
                System.out.println("Your Number is a Palindrome Number.");
            } else {
                System.out.println("Your Number is not a Palindrome Number.");
            }
        }
    }
    public static boolean isPalindrome(int num) {
        int reversed = reverse(num);
        return num == reversed;
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
