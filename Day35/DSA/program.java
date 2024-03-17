package Day35.DSA;

import java.util.ArrayList;
import java.util.List;

/**
 * print the maartix in the sprial order 
 */
public class program{
    public static void main(String[] args) {
        int[][] arr={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        List<Integer> res=new ArrayList<>();

        int top=0,bottom=arr.length-1,left=0,right=arr[0].length-1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                res.add(arr[top][i]);

            top++;

            for (int i = top; i <= bottom; i++)
                res.add(arr[i][right]);

            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    res.add(arr[bottom][i]);

                bottom--;
            }


            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    res.add(arr[i][left]);

                left++;
            }
        }
        System.out.println(res);
    }
}