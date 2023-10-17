import java.util.Objects;

public class PracticeQuestion38 {
    /*Problem Description
    Two arrays are given.
    The first array represents the names of the people who are waiting in a queue to enter the movie theater, in their waiting order.

    In the second array, the index denotes the seat number (Seat numbers start from 0) and the value gives the name of the person in that seat.
    The person who stands before Mridula (i.e the name that comes before Mridula in the first array) in the queue is her friend.

    Find Mridula’s friend’s seat number using the second array and return the seat number.
    Return -1 if that friend doesn't have a seat number.

    It's guaranteed that there will always be someone before Mridula.

    Hint: Iterate over the first array, find and store the friend’s name in a variable.
    Hint: Iterate over the second array to find the friend’s name and their corresponding seat number.*/

    public static int indexOfMridulasfriend(String[] array1, String[] array2) {
        String mridulasFriend = "";
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if (Objects.equals(array1[i], "Mridula") && array1[i] != array1[0]) {
                mridulasFriend = array1[i - 1];
            } else {
                index = -1;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            if (Objects.equals(array2[i], mridulasFriend)) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String[] array1 = {"Raghu", "Goli", "Farhat", "Mridula", "Rahul"};
        String[] array2 = {"Mridula", "Raghu", "Goli", "Farhat"};
        int index = indexOfMridulasfriend(array1, array2);
        System.out.println(index);
    }
}
