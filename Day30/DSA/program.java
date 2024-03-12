package Day30.DSA;

import java.util.Scanner;
/**
 * write a program to write go right 
 * 1) transpose 
 * 2) colwisereverse
 */
public class program {
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

    static void display(int[][] arr){
        System.out.println("The matrix are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        int[][] arr=readMatrix();
        System.out.println("---------------------------");
        int[][] res=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                res[j][i]=arr[i][j];
            }
        }
        display(res);

        for(int i=res.length-1;i>=0;i--){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }


    }
}
