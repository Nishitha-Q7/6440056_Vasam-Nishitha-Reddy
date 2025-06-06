import java.util.Scanner;

public class RecursiveFibonacci {

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            int fibNumber = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is: " + fibNumber);
        }

        scanner.close();
    }
}
