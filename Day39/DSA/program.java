package Day39.DSA;

import java.util.Arrays;
import java.util.Stack;
/**
 * reverse the array using the stack
 */
public class program{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=st.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}