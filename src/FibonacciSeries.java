import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int nth = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series is as follows:");
        for (int i = 1; i <= nth; i++) {
            System.out.print(" " + b + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
