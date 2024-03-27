package Day45.DSA;

import java.util.Stack;

/** returns the minimum element in constant time*/
public class program1 {
    static Stack<Integer> st=new Stack<>();
    static Stack<Integer> temp=new Stack<>();

    static void pushStack(int val){
        if(temp.isEmpty()){
            temp.push(val);
        }
        if(temp.peek()>val){
            temp.push(val);
        }
        st.push(val);
    } 

    static void popStack(){
        int top=st.pop();

        if(top==temp.peek()){
            temp.pop();
        }
    }
    public static void main(String[] args) {
        // int[] arr={6,7,8,5,3,10};

        pushStack(6);
        pushStack(7);
        pushStack(8);
        pushStack(5);
        pushStack(3);

        popStack();
     
        System.out.println(temp.peek());

      

        
    }
}
