import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Welcome to the Leap Year Calculator!\n");
            System.out.print("Please enter a year: ");
            int year = input.nextInt();
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}
