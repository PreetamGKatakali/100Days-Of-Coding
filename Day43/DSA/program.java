package Day43.DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * smaller nearest to the right 
 */
public class program {
    public static void main(String[] args) {
        int[] arr={1,3,2,4};

        List<Integer> list=new ArrayList<>();

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                list.add(-1);
            }
            else if(!st.isEmpty() && arr[i]<st.peek()){
                while(!st.isEmpty() && arr[i]<st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    list.add(-1);
                }
                else{
                    list.add(st.peek());
                }
            }
            else if(!st.isEmpty() && arr[i]>st.peek()){
                list.add(st.peek());
            }
            st.push(arr[i]);
        }
        System.out.println(list);
    }
}