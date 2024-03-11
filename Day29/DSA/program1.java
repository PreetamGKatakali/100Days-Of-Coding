package Day29.DSA;

import java.util.Scanner;

/**
 * write a program to reverse the 2D martrix rowwise
 */
public class program1{
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
        for(int i=0;i<arr.length;i++){
            int f=0,l=arr[0].length-1;
            while(f<l){
                int temp=arr[i][f];
                arr[i][f]=arr[i][l];
                arr[i][l]=temp;
                f++;
                l--;
            }
        }
        display(arr);
    }
}