package Day42.DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * write a program to find the nearest element to the right
 */
public class program {
    public static void main(String[] args) {
        int[] arr={1,3,2,4};

        Stack<Integer> st=new Stack<>();
        List<Integer> list=new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                list.add(-1);
            }
            else if(!st.isEmpty() && arr[i]<st.peek()){
                list.add(st.peek());
            }
            else if(!st.isEmpty() && arr[i]>st.peek()){
             
                while(!st.isEmpty() && arr[i]>st.peek()){
                    
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
