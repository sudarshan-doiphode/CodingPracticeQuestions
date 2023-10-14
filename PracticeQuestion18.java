import java.util.Scanner;

public class PracticeQuestion18 {
    /*Problem Description
    You are given a year as input,
    you have to return the number of centuries for the given year.
    A century is 100 years.
    Hint: Write down the conditions involved, explore conditionals to implement it.


    Sample Input 1
    1705

    Sample Output 1
    18

    Explanation 1
    100 occurs 17 times in 1705 and an extra 5 years is counted as a part of the new century.
    So 17 + 1 = 18.
    */

    public static int numberOfCenturiesInYear(int year) {
        int quotient = year / 100;
        int remainder = year % 100;
        if (remainder > 0) {
            ++quotient;
        }
        return quotient;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        int result = numberOfCenturiesInYear(year);
        System.out.println("Number of centuries: " + result);
    }
}
