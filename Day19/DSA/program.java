package Day19.DSA;

import java.util.HashMap;
/**
 * write a frist repeating element index
 */
public class program{
    static int fristRepeatingElement(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return j;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10, 5, 3, 4, 3, 5, 6 };
        int n=arr.length;
        int index=fristRepeatingElement(arr,n);
        System.out.println(index);


    }
}