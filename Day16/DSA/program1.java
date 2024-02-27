package Day16.DSA;

import java.util.Arrays;

/**
 * Move all the negative elements to the left side of the array
 */
public class program1 {
    public static void main(String[] args) {
        int[] arr={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
