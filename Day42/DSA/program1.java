package Day42.DSA;

import java.util.Stack;

/**
 * implementing the queue using the stack
 * here we are implementing the queue using the stack we are using the two stack
 */
public class program1 {
    static Stack<Integer> st1=new Stack<>();
    static Stack<Integer> st2=new Stack<>();

    static void enqueu(int val){
        while(!st1.isEmpty()){
            st2.push(st1.peek());
            st1.pop();
        }

        st1.push(val);

        while (!st2.isEmpty()) {
            st1.push(st2.peek());
            st2.pop();
        }
    }
    static void dequeu(){
        if(st1.isEmpty()){
            System.out.println("queue is empty!");
            return;
        }
        st1.pop();
    }
    static void dispaly(){
        for(int i=0;i<st1.size();i++){
            System.out.print(st1.get(i)+" ");
        }
        System.out.println();
 
    }
    public static void main(String[] args) {
        enqueu(10);
        enqueu(20);
        enqueu(30);
        enqueu(40);
        enqueu(50);

        dequeu();

        

        dispaly();
    }
}
