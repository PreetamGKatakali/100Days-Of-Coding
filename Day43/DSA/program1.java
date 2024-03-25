package Day43.DSA;
/**
 * implement stack using the queue 
 */
public class program1 {
    static int MAX_SIZE=5;
    static int front=-1;
    static int rear=0;
    static int[] arr=new int[MAX_SIZE];

    static void push(int val){
        if(front==MAX_SIZE){
            System.out.println("the Stack is full!");
            return;
        }
        ++front;
        arr[front]=val;
    }
    static void pop(){
        if(front==-1){
            System.out.println("the stack is empty!");
            return;
        }
        int val=arr[front];
        front--;
        System.out.println("The"+val+"element is poped");
    }
    static void display(){
        if(front==-1){
            System.out.println("The stack is empty!");
            return;
        }
        for(int i=front;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void peek(){
        if(front==-1){
            System.out.println("the Stack is empty!");
            return;
        }
        int val=arr[front];
        System.out.println("The is element "+val+" is the peek");
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        pop();
        pop();
        pop();

        display();
    }
}
