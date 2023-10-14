import java.util.Scanner;

public class PracticeQuestion17 {
    /*Problem Description
    Create a function that takes an integer as an argument
    and returns "Even" for even numbers or "Odd" for odd numbers.*/

    public static String isEvenOrOdd(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        String result = isEvenOrOdd(n);
        System.out.println("The number is :" + result);
    }
}
