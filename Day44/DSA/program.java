package Day44.DSA;

import java.util.ArrayList;
import java.util.Collections;
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

        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(-1);
            }
            if(!st.isEmpty() && arr[i]>st.peek()){
                list.add(st.peek());
            }
            if(!st.isEmpty() && arr[i]<st.peek()){
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
            st.push(arr[i]);
        }

        Collections.reverse(list);

        System.out.println(list);
    }
}
