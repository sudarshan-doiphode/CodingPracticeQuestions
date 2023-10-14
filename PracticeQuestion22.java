import java.util.Scanner;

public class PracticeQuestion22 {
    /*Problem Description
    A year is considered a leap year, if either of the 2 conditions are met:
    The year is multiple of 400.
    The year is multiple of 4 and not multiple of 100.
    Given a year, return "LEAP YEAR" if it's a leap year or return "COMMON YEAR".*/

    public static String isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "LEAP YEAR" : "COMMON YEAR";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        String result = isLeapYear(year);
        System.out.println(result);
    }
}
