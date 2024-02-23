package Day12.DSA;


import java.util.Arrays;
import java.util.HashMap;

/**
 * Two sum program 
 */
public class program1 {
    static int[] find(int[] arr,int target){
        HashMap<Integer,Integer> list=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];

            if(list.containsKey(complement)){
                return new int[]{list.get(complement),i};
            }

            list.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr={16,4,23,8,15,42,1,2};
        int[] res=find(arr, 19);
        System.out.println(Arrays.toString(res));
        

    }
}
