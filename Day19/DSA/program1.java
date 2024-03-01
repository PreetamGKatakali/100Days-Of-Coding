package Day19.DSA;
/**
 * write a program to find the non-repeating element
 */
public class program1 {
    static int find(int[] arr,int n){
        for(int i=0;i<n;i++){
            int j=0;
            for(j=0;j<n;j++){
                if(i!=j && arr[i]==arr[j]){
                    break;
                }
            }
            if(j==n){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={9,4,9,6,7,4};
        int n=arr.length;
        System.out.println(find(arr, n));

    }
}
