import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // ekbar Scanner create korlam

        great();

        int first = readNumber(input) + 1;
        int second = readNumber(input) + 2;

        int sum = first + second;
        System.out.println("Sum of the number is: " + sum);

        input.close(); // sheshe Scanner bondho korlam
    }

    public static int readNumber(Scanner input) {
        System.out.print("Please enter the number: ");
        return input.nextInt(); // input theke int porlam
    }

    public static void great() {
        System.out.println("Welcome to Calculator!\n");
    }
}
