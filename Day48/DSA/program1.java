package Day48.DSA;

import java.util.ArrayList;
import java.util.List;

/**
 * game of two stack
 */
public class program1 {
    static int twoStack(int max_sum,List<Integer> a,List<Integer> b){
        int result=0,st1_count=0,st2_count=0,total_sum=0;

        for(int st1_element:a){
            if(total_sum+st1_element>max_sum){
                break;
            }
            total_sum+=st1_element;
            st1_count++;
        }
        result=st1_count;

        for(int st2_element:b){
            total_sum+=st2_element;
            st2_count++;
            while(total_sum>max_sum && st1_count>0){
                total_sum-=a.get(st1_count-1);
                st1_count--;
            }
            result=(total_sum<=max_sum)?Math.max(st1_count+st2_count,result):result;
        }


        return result;
    }
    public static void main(String[] args) {
       List<Integer> a=new ArrayList<>(List.of(4,2,4,6,1));
       List<Integer> b=new ArrayList<>(List.of(2,1,8,5));
       int max_sum=11;

      System.out.println( twoStack(max_sum, a, b));

     


    }
}
