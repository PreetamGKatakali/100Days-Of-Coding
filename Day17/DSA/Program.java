package Day17.DSA;
/**
 * Write a program to find the secound biggest number from the array without the sort method
 */
public class Program {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,7};
        int secoundbig=0;
        int maxbig=0;
        for(int i=0;i<arr.length;i++){
            if(maxbig<arr[i]){
                secoundbig=maxbig;
                maxbig=arr[i];
            }
            if(arr[i]>secoundbig && maxbig!=arr[i]){
                secoundbig=arr[i];
            }
        }
        System.out.println(secoundbig);
    }
}