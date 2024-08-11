import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();


        boolean isEligible = (age >= 18)  ? true : false;

        String eligibilityStatus = isEligible ? "You are eligible to vote." : "You are not eligible to vote.";

        System.out.println(eligibilityStatus);
    }
}