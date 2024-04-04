package Day53.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program1 {
    public static void main(String[] args) {
        for(int i=5;i>=0;i--){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
