import java.util.Scanner;

public class FibonacciSeries_dowhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int nth = scanner.nextInt();
        int a = 0;
        int b = 1;
        int i = 1;
        System.out.println("Fibonacci Series is as follows:");

        do {
            System.out.print(" " + a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        } while (i <= nth);
    }
}