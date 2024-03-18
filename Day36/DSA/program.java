package Day36.DSA;
/**
 * Stack in the program
 */
public class program{
    static int MAX_SIZE=5;
    static int[] st=new int[MAX_SIZE];
    static int top=-1;

    static void push(int val){
        if(top==MAX_SIZE-1){
            System.out.println("The stack is full");
        }
        else{
            ++top;
            st[top]=val;
        }
    }
    static void pop(){
        if(top==-1){
            System.out.println("The stack is empty");
        }
        else{
            --top;
        }
    }
    static void peek(){
        if(top==-1){
            System.out.println("The stack is empty");
        }
        else{
            int val=st[top];
            System.out.println("The peek element is :"+val);
        }
    }
    static void display(){
        if(top==-1){
            System.out.println("The stack is empty");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(st[i]);
            }
        }
    }
    public static void main(String[] args) {
        push(10);
        push(20);
       
        push(30);
        push(40);
     
        pop();
       
        push(50);
        push(60);
        display();
        push(70);
    }
}