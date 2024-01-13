import java.util.Scanner;
import java.util.function.LongFunction;

public class HappyNumberApp {

    public static void main(String[] args) {

        long number = getNumberOfUser();

        LongFunction<Boolean> happyNumber = n -> {
            while (n > 9) {
                long sum = 0;
                while (n > 0) {
                    long digit = n % 10;
                    sum += digit * digit;
                    n /= 10;
                }
                n = sum;
            }
            return n == 1;
        };
        System.out.println(happyNumber.apply(number));

    }


    public static Long getNumberOfUser(){
        Scanner scanner = new Scanner(System.in);
        long num;

        do {
            System.out.println("Enter a positive number: ");
            while (!scanner.hasNextLong()) {
                System.out.println("Invalid input! Please enter a valid positive number: ");
                scanner.next();
            }
            num = scanner.nextLong();
        } while (num <= 0);
        return num;
    }

}
