package Day8.DSA;
/**
 * Write a program to find the given array is a part of the parent array
 */
public class program1 {
    public static void main(String[] args) {
        int[] arr={10,5,2,9};
        int[] arr1={10,5};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    count++;
                }
            }
        }
        System.out.println(count==arr1.length?"The arr1 is present in the arr":"The arr1 is not present in the arr");
    }
}
