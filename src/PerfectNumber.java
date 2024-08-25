import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("enter the number");
        int num = s.nextInt();
        int sum = 0;
        // find the divisors of the number tht return a whole number and then add the divisors
        for (int i=1; i <= 7;i++){
            int x = num%i;
            if (x == 0){
                System.out.println(sum+" + "+ i+ " = "+ (sum + i) );
                sum += i;
                System.out.println("divisor "+ i  );
        }
    }
        System.out.println("sum "+ sum  );
        if (sum == num){
            System.out.println("it is a perfect number" );

        }
        else {
            System.out.println("it is not a perfect number"  );

        }





    }


}
