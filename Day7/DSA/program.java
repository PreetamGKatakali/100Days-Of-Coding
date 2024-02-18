package Day7.DSA;
/**
 * Write a program to find the give value in the pair
 */
public class program {
    public static void main(String[] args) {
        int[] arr={1,5,7,-1,5};
        int k=6;
       
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(arr[i]+"+"+arr[j]+"="+k);
                }
            }
        }
    }
}
