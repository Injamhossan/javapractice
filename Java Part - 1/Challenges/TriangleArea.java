import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
       
        System.out.println("Welcome to Area Calculator\n");
        System.out.println("Please enter the base of the triangle:");
        double base = input.nextDouble();
        System.out.println("Please enter the height of the triangle:");
        double height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of the triangle is: " + area + "cms2");
        }  
    }
}
