package Day10.DSA;

import java.util.Arrays;

/**
 * Writte a program to find the stockSpane problem
 */
public class program {
    static int[] find(int[] arr){
        int[] res=new int[arr.length];
        res[0]=1;
        for(int i=1;i<arr.length;i++){
            res[i]=1;
            for(int j=i-1;(j>=0 && arr[i]>=arr[j]);j--){
                res[i]++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
      int[] arr={100,80,60,70,60,75,85};
      int[] res=find(arr);
      System.out.println(Arrays.toString(res));
    }
}
