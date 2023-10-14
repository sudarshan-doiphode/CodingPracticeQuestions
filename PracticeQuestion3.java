import java.util.Scanner;

public class PracticeQuestion3 {

    /*Problem Description
    You are given two numbers as input.
    You have to return true if the numbers are equal, else return false.*/

    public static boolean checkTwoNumberAreEqualOrNot(int n1, int n2) {
        return n1 == n2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        final boolean result = checkTwoNumberAreEqualOrNot(num1, num2);
        if (result) {
            System.out.println("The two number are equal...");
        }
        else {
            System.out.println("Two numbers are not equal...");
        }
    }
}
