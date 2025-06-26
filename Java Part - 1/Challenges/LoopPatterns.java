import java.util.Scanner;

public class LoopPatterns {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("We are here to print Pattern");
            System.out.print("Enter the number of rows: ");
            int rows = input.nextInt();
            printPattern(rows);
            printLeftPattern(rows);
            printReveresePattern(rows);
        }
    }
 
    public static void printLeftPattern(int maxRows) {
        System.out.println("\nHere is Left Pattern");
        int rows = maxRows;
         while (rows > 0) {
            // this loop prints spaces
            int j = 0;
            while (j < rows - 1) {
                System.out.print("  ");
                j++;
            }
            // this loop printes stars
            int i = 0;
            while (i <= (maxRows - rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void printReveresePattern(int maxRows) {
        System.out.println("\nHere is Reverse Pattern");
        int rows = maxRows;
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void printPattern(int maxRows) {
        System.out.println("Here is Right Pattern");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print(" *");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
