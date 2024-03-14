package Day32.DSA;
/**
 * find the matrix with the max 1's in the row
 */
public class program1 {
    public static void main(String[] args) {
        int[][] arr={
            {0, 0, 0, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 0},
            {0, 0, 0, 0}
        };
        int max_count=0,max_index=-1;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max_count){
                max_count=count;
                max_index=i;
            }
        }
        System.out.println(max_index);
    }
}
