package Day15.DSA;

import java.util.ArrayList;
import java.util.List;
/**
 * write a program to add the prime number in the array
 */
public class program{
    static boolean isprime(int val){
        for(int i=2;i<=val/2;i++){
            if(val%2==0){
                return false;
            }
        }
        return true;
    }
    static List<Integer> find(int[] arr){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(isprime(arr[i])){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr={12,5,4,7,89};
        System.out.println(find(arr));
    }
}
