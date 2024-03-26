package Day44.DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
/**
 * reverse the stack using the queue
 */
public class program1 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        Queue<Integer> list=new LinkedList<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        for(int i=st.size()-1;i>=0;i--){
            list.add(st.peek());
            st.pop();
        }

        while(!list.isEmpty()){
            st.push(list.peek());
            list.poll();
        }

        System.out.println(st);
    }
}
