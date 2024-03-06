package Day24.DSA;

import java.util.HashSet;
import java.util.Set;

/**
 * write a program to union array
 */
public class program1 {
   public static void main(String[] args) {
        int[] arr={1,2};
        int[] arr1={3,4};
        Set<Integer> list=new HashSet<>();
        for(int i:arr){
         list.add(i);
        }
        for(int i:arr1){
         list.add(i);
        }

        System.out.println(list);
   } 
}
