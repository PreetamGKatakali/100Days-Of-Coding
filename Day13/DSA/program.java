package Day13.DSA;

import java.util.HashMap;
/**
 * Write a program to count the occurcence of the value 
 */
public class program{
    public static void main(String[] args) {
        int[] arr={1,2,2,4,5,6,6,7};
        HashMap<Integer,Integer> list=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(list.containsKey(arr[i])){
                int val=list.get(arr[i]);
                list.put(arr[i],val=val+1);
            }
            else{
                list.put(arr[i],count);
            }
        }
        System.out.println(list);
    }
}