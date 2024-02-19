package Day8.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * we will learn how to remove the duplicates elements from the array 
 * 
 * Write a program to remove the duplicates from the array 
 * 
 * Note : if the j reaches to -1 then that elemen is unique
 */
public class program {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,6,6,7};
        List<Integer> List=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int j=i-1;
            for(;j>=0;j--){
                if(arr[i]==arr[j]){
                    break;
                }
            }
            if(j==-1){
                List.add(arr[i]);
            }
        }

        System.out.println(List);

    }
}
