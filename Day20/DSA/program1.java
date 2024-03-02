package Day20.DSA;

import java.util.ArrayList;
import java.util.List;
/**
 * write a program to find the cumulative sum 
 */
public class program1 {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        List<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            list.add(sum);
        }
        System.out.println(list);
    }
}
