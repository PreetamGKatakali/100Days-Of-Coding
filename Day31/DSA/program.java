import java.util.HashMap;
import java.util.Map;

/**
 * write a program to fincd the command elements from the row in the matrix
 */
public class program{
    static void printCommonElements(int[][] arr){
        Map<Integer,Integer> mp=new HashMap<>();

        for(int j=0;j<arr[0].length;j++){
            mp.put(arr[0][j],1);
        }

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(mp.get(arr[i][j])!=null && mp.get(arr[i][j])==i){
                    mp.put(arr[i][j],i+1);

                    if(i==arr.length-1){
                        System.out.println(arr[i][j]+" ");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={
            {1, 2, 1, 4, 8}, 
            {3, 7, 8, 5, 1}, 
            {8, 7, 7, 3, 1}, 
            {8, 1, 2, 7, 9}, 
        };
        printCommonElements(arr);
    }
}