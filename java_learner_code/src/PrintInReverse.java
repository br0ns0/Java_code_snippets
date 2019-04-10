import java.util.*;

public class PrintInReverse {
    /**
     * Complete the Java function below to print out all the Strings in the String array parameter in reverse order.
     * (The String at the highest index should be printed first, then the String at the next highest index, and so on.
     * The String at index 0 should be printed last.)
     * For example, if a String array called weekdays had value
     * {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
     */

    // printInReverse using for loop
    public void printInReverse1(String[] stringArray) {
        for (int i = stringArray.length - 1; i >= 0; i--) { //we work backwards
            System.out.println(stringArray[i]);
        }
    }

    // printInReverse using collections.reverse()

    public void printInReverse2(String[] stringArray) {
        Collections.reverse(Arrays.asList(stringArray));
        System.out.println(Arrays.asList(stringArray));
    }

}

/**
 * Friday
 * Thursday
 * Wednesday
 * Tuesday
 * Monday
 */
