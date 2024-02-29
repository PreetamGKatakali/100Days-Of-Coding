package Day18.DSA;

import java.util.ArrayList;

/**
 * write a program to get the list of the Strong number 
 */
public class program1 {
    static int fact(int val){
        int res=1;
        for(int i=val;i>=1;i--){
            res*=i;
        }
        return res;
    }
    static boolean isStrong(int val){
        int sum=0;
        int number=val;
        while (val!=0) {
            int temp=val%10;
            sum+=fact(temp);
            val=val/10;
        }
        if(number==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr={145,125,365,785,985};
        for(int i=0;i<arr.length;i++){
            if(isStrong(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
