package Day34.DSA;
/**
 * write a program to find weather the marteix is magic squre or not 
 * 
 * Note : apply the below logic in the method that ives true or false.
 */
public class program{
    public static void main(String[] args) {
        int[][] arr={
            { 2, 7, 6 },
            { 9, 5, 1 },
            { 4, 3, 8 }
        };

        int n=arr.length;

        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-1-i];
        }
        if(sum1!=sum2){
            System.out.println("not a magic matrix");
        }

        for(int i=0;i<arr.length;i++){
            int rowSum=0,colSum=0;
            for(int j=0;j<arr[0].length;j++){
                rowSum+=arr[i][j];
                colSum+=arr[j][i];
            }
            if(rowSum!=colSum || colSum!=sum1){
                System.out.println("not a magic matrix");
            }
        }
        
    }
}