package Day36.DSA;

import java.util.Stack;

/**
 * reverse the string useing the stack
 */
public class program1 {
    public static void main(String[] args) {
        String str="hello";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        
        for(int i=0;i<5;i++){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
