package Day41.DSA;

import java.util.Stack;

/**
 * find the equal stack
 */
public class program1 {
    static Stack<Integer> st1=new Stack<>();
    static Stack<Integer> st2=new Stack<>();
    static Stack<Integer> st3=new Stack<>();

    static void fillstack(int[] arr,Stack<Integer> st){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            st.push(sum);
        }
    }

    static int findMaxHeight(){
        int max=0;
        while(!st1.isEmpty() && !st2.isEmpty() && !st3.isEmpty()){
            int st1Height=st1.peek();
            int st2Height=st2.peek();
            int st3Height=st3.peek();

            if(st1Height==st2Height && st2Height==st3Height){
                max= st1Height;
                break;
            }
            if(st1Height>st2Height && st1Height>st3Height){
                st1.pop();
            }
            if(st2Height>st1Height && st2Height>st3Height){
                st2.pop();
            }
            if(st3Height>st1Height && st3Height>st2Height){
                st3.pop();
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr1={1,1,1,2,3};
        int[] arr2={2,3,4};
        int[] arr3={1,4,1,1};

        fillstack(arr1, st1);
        fillstack(arr2, st2);
        fillstack(arr3, st3);

        System.out.println(findMaxHeight());

        



    }
}
