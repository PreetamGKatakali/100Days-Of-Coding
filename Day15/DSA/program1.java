package Day15.DSA;

import java.util.Arrays;

/**
 * write a program to the threesum closest
 */
public class program1 {
    static int find(int[] arr,int target){
        Arrays.sort(arr);
        int result=0;
        int mindifference=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;

            while (left<right) {
                int sum=arr[i]+arr[left]+arr[right];

                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }

                int diff=Math.abs(sum-target);
                if(mindifference>diff){
                    mindifference=diff;
                    result=sum;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        int target=-6;
        System.out.println(find(arr,target));
    }
}
