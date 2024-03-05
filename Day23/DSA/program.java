package Day23.DSA;

import java.util.Arrays;
/**
 * write a program to sort the array 
 */
public class program{
    public static void main(String[] args) {
        int[] arr={1,4,8,6,9,2,7};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}