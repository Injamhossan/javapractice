import java.util.Scanner;

public class FarhenheitToCelsius {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Temperature Converter!");
            System.out.print("Enter the temperature in Fahrenheit: ");
            float fah = input.nextFloat();
            float cel = (fah - 32) * 5.0f/9.0f;
            System.out.println(fah + " Fahrenheit is equal to " + cel + " Celsius");
        }
    }    
}
