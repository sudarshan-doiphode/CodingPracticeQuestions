import java.util.Scanner;

public class PracticeQuestion7 {
    /*Problem Description
    You are given two decimal numbers as input.
    You have to multiply the two numbers and return the result.*/

    public static int multipleOfTwoNumbers(int n1, int n2) {
        return n1 * n2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        final int multiple = multipleOfTwoNumbers(num1, num2);
        System.out.println("The multiple of two numbers are: "+multiple);
    }
}
