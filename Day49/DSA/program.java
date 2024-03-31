package Day49.DSA;

import java.util.Stack;

public class program{
    static int prec(char c){
        if(c=='^'){
            return 3;
        }
        else if(c=='*' || c=='/'){
            return 2;
        }
        else if(c=='+' || c=='-'){
            return 1;
        }
        else{
            return -1;
        }
    }
    static String infixtoPostfix(String s){
         Stack<Character> st=new Stack<>();
         String res="";

         for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
                res+=s.charAt(i);

            }
            else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res+=st.peek();
                    st.pop();
                }
                if(!st.empty()){
                    st.pop(); 
                }
            }
            else{
                while(!st.isEmpty() && prec(st.peek())>prec(s.charAt(i))){
                    res+=st.peek();
                    st.pop();
                }
                st.push(s.charAt(i)); 
            }
         }
         while(!st.isEmpty()){
            res+=st.peek();
            st.pop();
         }

         return res;
    }
    public static void main(String[] args) {
        System.out.println(infixtoPostfix("(a-b/c)*(a/k-l)"));
    }
}