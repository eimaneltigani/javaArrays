import java.io.Console;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // declaring array literal
        int[] givenArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        //iterating over array
        for (int i : givenArray) {
            sum += i;
        }

        System.out.println("Sum of elements of array: " + sum);
    }
}
