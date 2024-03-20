package Day38.DSA;

import java.util.Stack;
/**
 * reverse the individual words
 */
public class program1 {
    public static void main(String[] args) {
        String str="hello world";
        Stack<Character> st=new Stack<>();

        String rev="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                st.push(str.charAt(i));
            }
            else{
                while (!st.isEmpty()) {
                    rev+=st.peek();
                    st.pop();
                }
                rev+=" ";
            }
        }
        while (!st.isEmpty()) {
            rev+=st.peek();
            st.pop();
        }
        System.out.println(rev);
    }
}
