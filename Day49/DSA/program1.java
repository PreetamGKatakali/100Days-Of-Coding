package Day49.DSA;
/**
 * count the subarray whose the first element minimum
 */
public class program1 {
    static int minElement(int arr[],int left,int right){
        int x=Integer.MAX_VALUE;
        for(int i=left;i<right;i++){
            x=Math.min(x, arr[i]);
        } 
        return x;
    }
    static int findsubarray(int[] arr){
        int count=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int min_element=minElement(arr, i+1, j+1);

                if(min_element>=arr[i]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,2};//{1}{3}{5}{2}{1,2,3}{1,3,5}{1,5}{1,2}
        System.out.println(findsubarray(arr));
    }
}
