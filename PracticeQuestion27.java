public class PracticeQuestion27 {
    /*Problem Description
    You are given an array of 10 integers (each integer can be between 0 and 9) as input.
    You have to return a string of those numbers in the form of a phone number.

    Hint: Use a loop to iterate through the array.

    Hint: Use a String and concatenate the elements of the array to the string which can be returned.

    Sample Input 1
    [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0]

    Sample Output 1
    1234567890*/

    public static String returnContactNumber(int[] array) {
        String number = "";
        for (int i = 0; i < array.length; i++) {
            number += array[i];
        }
        return number;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String contactNumber = returnContactNumber(array);
        System.out.println(contactNumber);
    }
}
