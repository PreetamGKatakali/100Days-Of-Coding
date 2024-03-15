package Day33.DSA;
/**
 * sum of the diagonal matrix 
 */
public class program {
    static void sumOfDiagonalMatrix(int[][] arr){
        int fristsum=0;
        int secoundsum=0;
        if(arr.length!=arr[0].length){
            System.out.println("the array is not equal");
        }
        else{
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    fristsum+=arr[i][j];
                }
                if((i+j)==arr[0].length-1){
                    secoundsum+=arr[i][j];
                }
            }
        } 
        }
        System.out.println(fristsum+" "+secoundsum);
    }
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {4,3,2,1},
            {7,8,9,6},
            {6,5,4,3}
        };
        sumOfDiagonalMatrix(arr);
        
    }
}
