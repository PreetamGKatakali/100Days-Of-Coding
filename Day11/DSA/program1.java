package Day11.DSA;

import java.util.ArrayList;
import java.util.List;

/**
 * finding the kth smallest value 
 */
public class program1 {
    public static void main(String[] args) {
        int[] arr1={1,2,2,3,4,5,6,7};
        int k=2;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            int j=i-1;
            for(;j>=0;j--){
                if(arr1[i]==arr1[j]){
                    break;
                }
            }
            if(j==-1){
                list.add(arr1[i]);
            }
        }

        System.out.println(list.get(k-1));

    }
}
