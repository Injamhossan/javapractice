import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to ArmStrong Number!");
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            boolean isArmStrong = isArmStrong(num);
            if (isArmStrong) {
                System.out.println("Your Number is an ArmStrong Number");
            } else {
                System.out.println("Your Number is not an ArmStrong Number");
            }
        }
    }

    public static boolean isArmStrong(int num) {
        int originalNum = num; // store original number
        int noOfDigits = numOfDigits(num);
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            finalNumber += (int) Math.pow(lastDigit, noOfDigits);
        }
        return originalNum == finalNumber; // compare original and calculated
    }

    public static int numOfDigits(int num) {
        if (num == 0)
            return 1;
        int digits = 0;
        while (num > 0) {   
            digits++;
            num /= 10;
        }
        return digits;
    }
}
