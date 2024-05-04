import java.util.ArrayList;
import java.util.List;

public class program{
    static List<Integer> func(int[][] mat,int row,int col){
        int low=0;
        int hight=col-1;

        while(low<=hight){
            int mid=(low+hight)/2;

            int index=findMaxRow(mat,row,mid);

            int left=mid-1>=0?mat[index][mid-1]:-1;
            int right=mid+1<col?mat[index][mid+1]:-1;

            if(mat[index][mid]>left && mat[index][mid]> right){
                return new ArrayList<>(List.of(index,mid));
            }
            else if(mat[index][mid]< left){
                hight=mid-1;
            }
            else{
                low=mid+1;
            }
          
        }

        return new ArrayList<>(List.of(-1));
    }
    static int findMaxRow(int[][] mat, int row, int mid) {
        int max=Integer.MIN_VALUE;
        int rowIndex=0;
       for(int i=0;i<row;i++){
           if(max<mat[i][mid]){
            max=mat[i][mid];
            rowIndex=i;
           }
       }
       return rowIndex;
    }
    public static void main(String[] args) {
        int[][] mat={
            {4,2,5,1,4,5},
            {2,9,3,2,3,2},
            {1,7,6,0,1,3},
            {3,6,2,3,7,2}
        };
        System.out.println(func(mat, mat.length, mat[0].length));


    }
}