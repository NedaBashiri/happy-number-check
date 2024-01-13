import java.util.Scanner;

public class HappyNumberApp {


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
