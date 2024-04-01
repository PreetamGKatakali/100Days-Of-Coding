package Day50.DSA;

import java.util.Stack;
/**
 * write a program to remove the adjacent duplicates from the string
 */
public class program {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        String str="abbaca";

        for(int i=0;i<str.length();i++){
            char current_element=str.charAt(i);
            if(!st.isEmpty() && st.peek()==current_element){
                st.pop();
            }
            else{
                st.push(current_element);
            }

        }
        System.out.println(st);
    }
}
