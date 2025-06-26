import java.util.Scanner;

public class Perimetar {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Perimeter Calculator");
            System.out.println("Please Enter all 4 sides in CMS: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double d = input.nextDouble();
            double perimeter = a + b + c + d;
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
    }
}
