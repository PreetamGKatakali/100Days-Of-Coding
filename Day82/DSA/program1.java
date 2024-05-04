import java.util.ArrayList;
import java.util.Arrays;

public class program1 {
    static boolean binarySearch(ArrayList<Integer> arr,int target){
        int low=0;int hight=arr.size()-1;
        while(low<=hight){
            int mid=(low+hight)/2;

            if(arr.get(mid)==target){
                return true;
            }
            else if(arr.get(mid)<target){
                low=mid+1;
            }
            else{
                hight=hight-1;
            }
        }
        return false;
    }
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat,int target){
        int row=mat.size();
        int col=mat.get(0).size();

        for(int i=0;i<row;i++){
            if(mat.get(i).get(0)<=target && target<=mat.get(i).get(col-1)){
                return binarySearch(mat.get(i),target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        System.out.println(searchMatrix(matrix,12));
    }
}
