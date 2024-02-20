package Day9.DSA;
/**
 * Write a program to find the maxProducts array from the given array
 */
public class program1 {
    static int maxproductArray(int[] arr){
        int result=arr[0];
        for(int i=0;i<arr.length;i++){
            int mul=arr[i];
            for(int j=i+1;j<arr.length;j++){
                mul*=arr[j];
                result=Math.max(result, mul);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int res=maxproductArray(arr);
        System.out.println(res);
        
    }
}
