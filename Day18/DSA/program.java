package Day18.DSA;
/**
 * write a program to find the secound smallest 
 */
public class program{
    public static void main(String[] args) {
        int[] arr={2,1,6,3,5,8,7};
        int fristsmallest=Integer.MAX_VALUE;
        int secoundsmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<fristsmallest){
                secoundsmallest=fristsmallest;
                fristsmallest=arr[i];
            }
            if(secoundsmallest>arr[i] && fristsmallest!=arr[i]){
                secoundsmallest=arr[i];
            }
        }
        System.out.println(secoundsmallest);
    }
}