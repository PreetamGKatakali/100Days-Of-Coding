package Day13.DSA;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the command element deom the two arrays 
 */
public class program1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr1={6,7,2,4,8};
        Set<Integer> list=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
    }
}
