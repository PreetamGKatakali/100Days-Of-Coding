package Day40.DSA;

import java.util.HashMap;
/**
 * finding the nearest the greater element knowing that this is not in the stack
 */
public class program{
    public static void main(String[] args) {
        int[] arr={ 13 , 7, 6 , 12 };
        HashMap<Integer,Integer> list=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            for(;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    list.put(arr[i], arr[j]);
                    break;
                }
            }
            if(j==arr.length+1 || j==arr.length){
                list.put(arr[i], -1);
            }
        }
        System.out.println(list);
    }
}