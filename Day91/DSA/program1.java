import java.util.ArrayList;
import java.util.List;

public class program1 {
    static int get(int n,int r){
        int res=1;

        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    static List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>> ans=new ArrayList<>();

        for(int row=1;row<=n;row++){
            List<Integer> tempList=new ArrayList<>();

            for(int col=1;col<=row;col++){
                tempList.add(get(row-1,col-1));
            }
            ans.add(tempList);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(pascalTriangle(5));
    }
}
