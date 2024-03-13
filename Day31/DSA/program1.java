import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * sort the matrix 
 */
public class program1 {
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
        int[][] arr={{1, 4, 2},
            {3, 5, 6},
            {9, 7, 8}
        };

        int[] list=new int[arr.length*arr[0].length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                list[k]=arr[i][j];
                k++;
            }
        }

        Arrays.sort(list);
        k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=list[k];
                k++;
            }
        }

        display(arr);


        
        
    }
}
