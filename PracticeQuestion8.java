import java.util.Scanner;

public class PracticeQuestion8 {
    /*Problem Description
    You are given two numbers as input.
    You have to return the remainder when you divide the first number by the second number*/

    public static int remainderOfNumber(int n1, int n2) {
        return n1 % n2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        final int remainder = remainderOfNumber(num1, num2);
        System.out.println("The remainder of two number is :" + remainder);
    }
}
