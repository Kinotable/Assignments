import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.next();

        day = day.trim(); // remove any leading or trailing whitespace

        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("You entered Monday");
        } else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("You entered Tuesday");
        } else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("You entered Wednesday");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("You entered Thursday");
        } else if (day.equalsIgnoreCase("Friday")) {
            System.out.println("You entered Friday");
        } else if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("You entered Saturday");
        } else if (day.equalsIgnoreCase("Sunday")) {
            System.out.println("You entered Sunday");
        } else {
            System.out.println("Invalid day of the week. Please enter a valid day (e.g. Monday, Tuesday, etc.)");
        }

        scanner.close();
    }
}