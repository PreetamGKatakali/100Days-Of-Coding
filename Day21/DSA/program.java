package Day21.DSA;

import java.util.Arrays;

/**
 * write program to sort the array
 */
public class program{
    public static void main(String[] args) {
        int[] arr={1,5,7,8,9,4,6};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}