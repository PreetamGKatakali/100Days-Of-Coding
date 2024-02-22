package Day11.DSA;

/**
 * Write a program to find the equal of the stack
 */

public class program{
    static int stackEquals(int[] arr1,int[] arr2,int[] arr3){
        
        int sum1=0,sum2=0,sum3=0;

        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            sum2+=arr2[i];
        }
        for(int i=0;i<arr3.length;i++){
            sum3+=arr3[i];
        }

        int top1=0,top2=0,top3=0;
        while(true){
            if(top1==arr1.length || top2==arr2.length || top3==arr3.length){
                return 0;
            }

            if(sum1==sum2 && sum2==sum3){
                return sum1;
            }

            if(sum1>=sum2 && sum1>=sum3){
                sum1 -=arr1[top1++];
            }
            if(sum2>=sum1 && sum2>=sum3){
                sum2 -=arr2[top2++];
            }
            if(sum3>=sum1 && sum3>=sum2){
                sum3 -=arr3[top3++];
            }
        }
    }
    public static void main(String[] args) {
       int[] arr1={3,2,1,1,1};
       int[] arr2={4,3,2};
       int[] arr3={1,1,4,1};
       
       System.out.println(stackEquals(arr1,arr2,arr3));
    }
}