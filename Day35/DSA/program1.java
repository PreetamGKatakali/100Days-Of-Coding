package Day35.DSA;
/**
 * write a program to remove all the even odd number from the matrix
 */
public class program1 {
    public static void main(String[] args) {
        int[][] arr={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]%2==0){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
