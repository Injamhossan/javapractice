public class Parameter {
    public static void main(String[] args) {        
        Greating();
        int num = sumTwoNumber(4, 2);
        System.out.println(num);
    }
    public static int sumTwoNumbers (int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static void Greating () {
        System.out.println("Welcome to Perameter!");
    }

    public static int sumTwoNumber (int first, int second) {
        System.out.println("First Number Received: " + first);
        System.out.println("Second Number Received: " + second);
        
        int sum = first + second;
        return sum;
    }
}
