package Day27.DSA;

import java.util.Scanner;

/**
 * write a program to find the col wise smallest in the 2D array
 */
public class program2 {
    static int[][] readMatrix(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the order of the matrix");
        int row=s.nextInt();
        int col=s.nextInt();
        int[][] res=new int[row][col];
        System.out.println("enter the matrix in the order of :"+row*col);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                res[i][j]=s.nextInt();
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] arr=readMatrix();

        for(int i=0;i<arr.length;i++){
            int smallest=Integer.MAX_VALUE;
            for(int j=0;j<arr[0].length;j++){
                if(smallest>arr[j][i]){
                    smallest=arr[j][i];
                }
            }
            System.out.println("The"+i+"col smallest is :"+smallest);
        }
    }
}
