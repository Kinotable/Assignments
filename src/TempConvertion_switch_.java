import java.util.Scanner;
public class TempConvertion_switch_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:

                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5.0/9.0;
                System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);
                break;

                case 2:
                    System.out.print("Enter temperature in Celsius: ");
                    double c = scanner.nextDouble();
                    double f = c * 9.0/5.0 + 32;
                    System.out.printf("%.2f°C is equal to %.2f°F%n", c, f);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

}
