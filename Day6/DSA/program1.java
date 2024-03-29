package Day6.DSA;

import java.util.Arrays;

/**
 * Write a program to rotate the kth times in the given array 
 */
public class program1 {

    static int[] reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    static int[] rotate(int[] arr,int k){
        arr=reverse(arr, 0, arr.length-1);
        arr=reverse(arr, 0, k-1);
        arr=reverse(arr, k, arr.length-1);

        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        arr=rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
