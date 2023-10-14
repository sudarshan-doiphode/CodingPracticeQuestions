import java.util.Scanner;

public class PracticeQuestion6 {
    /*Problem Description
    You are given a number as input. Y
    ou have to increment the number by 1 and return the result.*/

    public static int incrementNumberByOne(int n1) {
        return ++n1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        final int result = incrementNumberByOne(num);
        System.out.println("The incremented number is: " + result);
    }

}
