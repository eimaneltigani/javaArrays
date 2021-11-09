import java.io.Console;
import java.util.*;

public class power {
    
    public static int[] toPower(int size, int power) {
        int[] sizeArray = new int[size];
        int i;

        for (i = 0; i < size; i++) {
            sizeArray[i] = (int) Math.pow(i, power);
        }

        return sizeArray;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(toPower(4, 2)));
    
    }
}
