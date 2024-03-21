package Day39.DSA;

import java.util.Stack;
/**
 * sort the stack by using the temp stack
 */
public class program1 {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();

        st1.push(34);
        st1.push(3);
        st1.push(31);
        st1.push(98);
        st1.push(92);
        st1.push(23);

        while(!st1.isEmpty()){
            int val=st1.pop();
            if(st2.isEmpty()){
                st2.push(val);
            }
            else{
                if(val>=st2.peek()){
                    st2.push(val);
                }
                else{
                    while(!st2.isEmpty()){
                        st1.push(st2.pop());
                    }
                    st2.push(val);
                }
            }
        }
        System.out.println(st2);


    }
}
