package Day79.DSA;

import java.util.HashSet;
import java.util.Set;

/** Set Matrix zeroes */
public class program1 {
    public static void main(String[] args) {
       int[][] arr={
        {1,1,1},
        {1,0,1},
        {1,1,1}
       };
       
       int row=arr.length;
       int col=arr[0].length;

       Set<Integer> rset=new HashSet<>();
       Set<Integer> cset=new HashSet<>();

       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(arr[i][j]==0){
                rset.add(i);
                cset.add(j);
            }
        }
       }

       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(rset.contains(i) || cset.contains(j)){
                arr[i][j]=0;
            }
        }
       }

       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
    }
}
