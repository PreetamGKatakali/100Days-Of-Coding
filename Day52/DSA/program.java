package Day52.DSA;

import java.util.Arrays;
import java.util.Stack;

/**
 * Find the next greater element
 */
public class program{
    static int[] nexGreaterElement(int[] arr){
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n*2-1;i>=0;i--){
            while (st.isEmpty()==false && st.peek()<=arr[i%n]) {
                st.pop();
            }

            if(i<n){
                if(st.isEmpty()==false){
                    res[i]=st.peek();
                }
                else{
                    res[i]=-1;
                }
            }
            st.push(arr[i%n]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={5,7,1,2,6,0};

        int[] arr2=nexGreaterElement(arr);

        System.out.println(Arrays.toString(arr2));
    }
}