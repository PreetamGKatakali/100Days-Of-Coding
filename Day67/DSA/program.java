package Day67.DSA;
/**
 * implmeneting the queue using the linkedlist 
 */
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class program {
    static Node head;
    static void push(int val){
        Node newNode=new Node(val);
        if(head==null){ 
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    static void pop(){
        Node temp=head;
        Node secoundNode=null;
        while (temp.next!=null) {
            secoundNode=temp;
            temp=temp.next;
        }
        secoundNode.next=null;
    }
    static void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        pop();
        pop();
        push(50);
        push(60);
        display();
    }
}
