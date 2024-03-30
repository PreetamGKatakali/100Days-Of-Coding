package Day48.DSA;

import java.util.Stack;

/**
 * reverse the stack using the recursion
 */
public class program {
    static Stack<Integer> s=new Stack<>();

    static void insert_bottom(int x,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int temp=s.peek();
        s.pop();
        insert_bottom(x, s);
        s.push(temp);
    }
    static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int x=s.peek();
        s.pop();
        reverse(s);
        insert_bottom(x,s);
    }
    public static void main(String[] args) {
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        reverse(s);

        System.out.println(s.peek());
    }
}
