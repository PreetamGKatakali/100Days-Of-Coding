/**
 * From now we will learn about the array in DSA
 * 
 * Imp : Basic of array imp 
 * 
 * Wite a program to find the missing number
 */
public class program {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,7};
        int total=arr.length*(arr.length+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(total-sum);
    }
}
