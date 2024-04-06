package Day55.DSA;

import java.util.Stack;
/**
 * sort stack without using other stack;
 */
public class program{
    static Stack<Integer> st=new Stack<>();

    static void sortedStack(Stack<Integer> st,int elment){
        if(st.isEmpty() || elment > st.peek()){
            st.push(elment);
        }
        else{
            int top=st.peek();
            st.pop();
            sortedStack(st,elment);
            st.push(top);
        }
    }

    static void sortStack(Stack<Integer> st){
        if(!st.isEmpty()){
            int top=st.peek();
            st.pop();

            sortStack(st);

            sortedStack(st,top);
        }
    }
    
    public static void main(String[] args) {
        st.push(50);
        st.push(30);
        st.push(20);
        st.push(40);
        st.push(10);

        sortStack(st);

        System.out.println(st);




    }
}