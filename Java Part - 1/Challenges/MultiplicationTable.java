import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to Multiplication World\n");
            System.out.print("Please enter your number: ");
            int num = scanner.nextInt();
            printMultiplicationtable(num);
        }
    }

    public static void printMultiplicationtable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
