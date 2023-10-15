import java.util.Scanner;

public class PracticeQuestion29 {
    /*Problem Description
    You are given a number.
    Check if it's a prime number and return true or false accordingly.*/

    public static boolean isPrime(int n) {
        int counter = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 0 && n > 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        boolean res = isPrime(num);
        System.out.println(res);
    }
}
