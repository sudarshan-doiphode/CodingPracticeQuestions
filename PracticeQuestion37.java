import java.util.Arrays;

public class PracticeQuestion37 {
    /*Problem Description
    You are given two arrays of strings.
    Generate a new string array where you combine each string from the first array with each string from the second array.*/

    public static String[] newArrayAfterCombiningFirstAndSecondArray(String[] s1, String[] s2) {
        int newSize = s1.length*s2.length;
        String[] array = new String[newSize];
        int count = 0;
        for (int i=0;i<s1.length;i++){
            for (int j=0;j<s2.length;j++){
                array[count] = s1[i] +s2[j];
                count++;
            }
        }
        return array;
    }


    public static void main(String[] args) {
        String[] s1 = {"a", "c", "e"};
        String[] s2 = {"b", "d", "f"};
        String[] result = newArrayAfterCombiningFirstAndSecondArray(s1,s2);
        Arrays.stream(result).forEach(element->System.out.println(element));
    }
}
