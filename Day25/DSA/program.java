package Day25.DSA;

import java.util.HashSet;
import java.util.Set;
/**
 * intersection of two arrays
 */
public class program{
    public static void main(String[] args) {
        Set<Integer> list=new HashSet<>();
        int[] arr={1,2,3,4};
        int[] arr1={5,6,1,2};
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