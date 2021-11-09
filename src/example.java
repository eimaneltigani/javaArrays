import java.io.Console;
import java.util.*;

public class example {
    public static void main(String[] args) throws Exception {
        double[] exampleArray = {1,5,6,5,4,1};
          //setting the first element as the base maximum
          double maximum = exampleArray[0];
          int index = 0;
          
          //loop through array starting at second element 
          //compare compare current element value and update maximum if highest
          for (int i = 1; i<exampleArray.length; i++) {
               if (exampleArray[i] > maximum) {
                    maximum = exampleArray[i];
                    index = i;
               }
          }

          System.out.println(index);
          // returns index of maximum number in array which is 2
    }
}