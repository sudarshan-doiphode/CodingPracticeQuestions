import java.util.Scanner;

public class PracticeQuestion5 {

    /*Problem Description
    You are given a number as input.
    You have to return the cube of that number. Cube of a number basically means the number is multiplied by itself twice.*/

    public static int cubeOfNumber(int n1) {
        return n1 * n1 * n1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = scanner.nextInt();
        final int cube = cubeOfNumber(num1);
        System.out.println("The cube of number is :" + cube);
    }
}
