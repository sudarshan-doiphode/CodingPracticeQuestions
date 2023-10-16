import java.util.Scanner;

public class PracticeQuestion34 {
    /*Problem Description
    Given the speed of a car in kilometers per hour,
    return its speed in meters per second.*/

    public static int kmPerHourToMeterPerSecond(int km) {
        return (km * 1000) / 3600;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in Km: ");
        int km = scanner.nextInt();
        int result = kmPerHourToMeterPerSecond(km);
        System.out.println("Conversion of Km/Hr to Meter/Sec is: " + result);
    }
}
