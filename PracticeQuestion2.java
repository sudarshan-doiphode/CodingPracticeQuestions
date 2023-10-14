import java.util.Scanner;

public class PracticeQuestion2 {

    /*Problem Description
    You are given two numbers as input.
    You have to subtract the second number from the first number and return the difference.*/

    public static int differenceBetweenTwoNumber(int n1, int n2){
        return n1 - n2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        final int result = differenceBetweenTwoNumber(num1, num2);
        System.out.println("The difference of two Numbers are: " + result);
    }
}
