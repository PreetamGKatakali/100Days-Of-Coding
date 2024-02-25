

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class program {
    static List<List<Integer>> ThreeSum(int arr[]){
        Arrays.sort(arr);
        Set<List<Integer>> res=new HashSet<>();

        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;

            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];

                if(sum==0){
                    res.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return new ArrayList<>(res);
    }
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        System.out.println(ThreeSum(arr));

    }
}
