package Day10.DSA;

import java.util.Arrays;
/**
 * Write a program to reverse the given array
 */
public class program1 {
    static int[] reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] res=reverse(arr);
        System.out.println(Arrays.toString(res));
    }
}
