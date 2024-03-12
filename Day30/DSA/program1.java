package Day30.DSA;
/**
 * Write a program to check weather the row is sorted or not in the 2D array
 */
public class program1 {
    public static void main(String[] args) {
        int[][] arr={{ 1, 2, 3, 4, 5 },
                     { 4, 3, 1, 2, 6 },
                     { 8, 7, 6, 5, 4 },
                     { 5, 7, 8, 9, 10 }};
        int result=0;
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<arr[0].length-1;j++){  
                if(arr[i][j+1]<=arr[i][j]){
                    break;
                }
            }
            if(j==arr[0].length-1){
                result++;
            }
        }
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=arr[0].length-1;j>0;j--){
                if(arr[i][j-1]<=arr[i][j]){   
                    break;
                }
            }
            if(arr[0].length > 1 && j==0){
                result++;
            }
        }
        System.out.println(result);
    }
}
