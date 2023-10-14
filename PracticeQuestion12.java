import java.util.Scanner;

public class PracticeQuestion12 {
    /*Problem Description
    The second wave of COVID-19 is over and you can finally go on a road trip with your friends.
    The only problem is that your car has limited petrol.
    You know that on an average your car gives you x kilometers per litre of petrol.
    The nearest petrol pump is y kilometers away from your current location.
    Given that you have p litres of petrol left in your car,
    return true if you can make it to the petrol station in time, else return false.


    Hint: Understand the relation between speed, distance and time and implement it.

    Input format
    The input consists of 3 double values denoting - petrol left, average kilometers per litre of petrol and distance from petrol pump, in that order.

    Output format
    Return true if you can make it to the petrol pump in time, else return false.*/

    public static boolean isVehicleCanReachToPump(double petrolLeft, double averagePerLiter, double distanceFromPetroPump) {
        double distanceCanBeCoveredWithPetrolLeft = petrolLeft * averagePerLiter;
        return (distanceCanBeCoveredWithPetrolLeft >= distanceFromPetroPump) ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the petroLeft in liter of your car: ");
        double petrolLeft = scanner.nextDouble();
        System.out.println("Enter the average of your car: ");
        double average = scanner.nextDouble();
        System.out.println("Enter the distance from nearest petrol pump: ");
        double distanceFromNearestPetrolPump = scanner.nextDouble();
        final boolean distanceCanbeCovered = isVehicleCanReachToPump(petrolLeft, average, distanceFromNearestPetrolPump);
        if (distanceCanbeCovered) {
            System.out.println("You made it...!!!");
        } else {
            System.out.println("Look for towing the van......");
        }
    }
}
