import java.util.Scanner;

public class PracticeQuestion21 {
    /*Problem Description
    Given the day of the week as numbers from 1 to 7,
    return the corresponding weekday based on the translation given below.
    1 = "Monday", 2 = “Tuesday”…… 7 = “Sunday”.
    If the number is not in the range 1 to 7 return "Invalid".*/

    public static String weekDay(int day) {
        switch (day) {
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            case 7 -> {
                return "Sunday";
            }
            default -> {
                return "Invalid";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day in number: ");
        int day = scanner.nextInt();
        String result = weekDay(day);
        System.out.println(result);
    }


}
