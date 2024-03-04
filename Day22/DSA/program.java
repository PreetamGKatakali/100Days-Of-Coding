package Day22.DSA;

import java.util.Arrays;
/**
 * write a array in the wave format 
 */
public class program{
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static void main(String[] args) {
        int[] arr={10, 90, 49, 2, 1, 5, 23};
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i+=2){
            swap(arr, i, i+1);
        }

        System.out.println(Arrays.toString(arr));

    }
}