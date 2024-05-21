package Day100.DSA;

public class program {
    static public int countSquares(int[][] mat) {
        int count = 0;

        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                if(mat[row][col] == 1){
                    int min = Integer.MAX_VALUE;

                    if(col - 1 >= 0)
                        min = Math.min(mat[row][col - 1], min);
                    else min = 0;
                    
                    if(row - 1 >= 0)
                        min = Math.min(mat[row - 1][col], min);
                    else min = 0;

                    if(row - 1 >= 0 && col - 1 >= 0)
                        min = Math.min(min, mat[row - 1][col - 1]);
                    else min = 0;
                    
                    mat[row][col] += min;
                    count += mat[row][col];
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[][] arr={
            {0,1,1,1},
  {1,1,1,1},
  {0,1,1,1}
        };
        System.out.println(countSquares(arr));
    }
}
