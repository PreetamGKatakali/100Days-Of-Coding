package Day57.DSA;

import java.util.Stack;

class program {
    static Stack<Integer> st=new Stack<>();

    static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int x=st.peek();
        st.pop();
        reverse(st);
        insert_bottom(x,st);
    }


    static void insert_bottom(int x, Stack<Integer> st2) {
        if(st.isEmpty() || x%2==0){
            st.push(x);
            return;
        }
        else{
            int temp=st.peek();
            st.pop();
            insert_bottom(x, st2);
            st.push(temp);
        } 
    }


    public static void main(String[] args) {
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        reverse(st);

        System.out.println(st);


    } 
}