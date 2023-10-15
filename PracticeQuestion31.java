public class PracticeQuestion31 {
    /*Problem Description
    In the given array, take all the even numbers and find the sum of their cubes*/

    public static int cubeOfEvenNumbersInAnArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += (array[i] * array[i] * array[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1};
        int result = cubeOfEvenNumbersInAnArray(array);
        System.out.println(result);
    }
}
