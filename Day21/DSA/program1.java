package Day21.DSA;
/**
 * write a program to find the triple sum in the array
 */
public class program1 {
    static boolean find3number(int[] arr,int sum){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1, 4, 45, 6, 10, 8 };
        int sum=22;
        System.out.println(find3number(arr, sum));

    }
}
