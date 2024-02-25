
import java.util.Arrays;
/**
 * sawping the element in the array based on the pairs 
 */
public class program1 {
    static int[] swapElement(int[] arr){
        if(arr.length%2==0){
           for(int i=0;i<=arr.length-2;i=i+2){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
           }
           return arr;

        }
        else{
            return new int[]{};
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(swapElement(arr)));
    }
}
