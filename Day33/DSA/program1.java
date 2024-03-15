package Day33.DSA;
/**
 * printing the boundary elements of a matrix
 */
public class program1 {
    public static void main(String[] args) {
        int[][] arr={ { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 } };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==0){
                    System.out.print(arr[i][j]+" ");
                }
                else if(i==arr.length-1){
                    System.out.print(arr[i][j]+" ");
                }
                else if(j==0){
                    System.out.print(arr[i][j]+" ");
                }
                else if(j==arr[0].length-1){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
