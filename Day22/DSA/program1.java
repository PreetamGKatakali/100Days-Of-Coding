package Day22.DSA;

import java.util.Arrays;

/**
 * write a program to sort the array
 */
public class program1 {
    public static void main(String[] args) {
        int[] arr={10, 90, 49, 2, 1, 5, 23};
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
