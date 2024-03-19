package Day37.DSA;
public class program1 {
    static int MAX_SIZE=5;  
    static int front=0;
    static int rear=-1;
    static int[] s=new int[MAX_SIZE];

    static void push(int val){
        if(isFull()){
            System.out.println("The stack is full!");
        }
        else{
            ++rear;
            s[rear]=val;
        }
    }
    static void pop(){
        if(isEmpty()){
            System.out.println("The stack is empty!");
        }
        else{
            int element=s[rear];
            --rear;
            System.out.println("The element is poped "+element);
        }
    }

    static void peek(){
        if(isEmpty()){
            System.out.println("The Stack is empty!");
        }
        else{
            int element=s[rear];
            System.out.println("The top elemet is :"+element);
        }
    }
    static boolean isFull(){
        if(rear==MAX_SIZE-1){
            return true;
        }
        return false;
    }
    static boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        return false;
    }
    static void display(){
        if(isEmpty()){
            System.out.println("The stack is empty!");
        }
        else{
            System.out.println("The element's are :");
            for(int i=rear;i>=front;i--){
                System.out.println(s[i]);
            }
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        display();
        peek();
    }
}
