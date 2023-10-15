import java.sql.Array;
import java.util.Arrays;
import java.util.function.IntConsumer;

public class PracticeQuestion30 {
    /*Fibonacci Series till size given*/

    public static int[] fibonacciSeries(int n) {
        int[] fibonacciArray = new int[n + 1]; // size=3 means 0,1,2 so taken n+1 that means 0,1,2,3
        int first = 0;
        int second = 1;
        int next;
        for (int i = 0; i <= n; i++) { //0,1,2,3
            fibonacciArray[i] = first;
            next = first + second;
            first = second;
            second = next;
        }
        return fibonacciArray;
    }

    public static void main(String[] args) {
        int size = 3;
        int[] result = fibonacciSeries(size);
        System.out.println("Fibonacci Series of number: ");
//        Arrays.stream(result).forEach(ele -> System.out.print(ele + " "));
        Arrays.stream(result).iterator().forEachRemaining((IntConsumer) ele -> System.out.print(ele + " "));
    }
}
