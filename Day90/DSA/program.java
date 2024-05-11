package Day90.DSA;

import java.util.ArrayList;
import java.util.List;

public class program {
    static List<List<Integer>> generate(int  num){
        List<List<Integer>> result=new ArrayList<>();

        if(num==0) return result;

        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(num==1) return result;

        for(int i=1;i<num;i++){
            List<Integer> prevRow=result.get(i-1);

            ArrayList<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-1;j++){
                row.add(prevRow.get(j)+prevRow.get(j+1));
            }
            row.add(1);

            result.add(row);


        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(generate(6));
    }
}
