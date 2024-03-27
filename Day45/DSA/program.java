package Day45.DSA;

import java.util.Stack;

/**Length of the longest valid substring */
public class program {
    static int findMaxLength(String str){
        int n=str.length();

        Stack<Integer> st=new Stack<>();
        st.push(-1);

        int res=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                st.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                if(!st.empty()){
                    res=Math.max(res, i-st.peek());
                }
                else{
                    st.push(i);
                }
            }
         
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "((()()";
        System.out.println(findMaxLength(str));
    }
}
