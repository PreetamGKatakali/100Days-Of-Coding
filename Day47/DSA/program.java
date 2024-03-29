class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class program{
    static Node head;
    static void push(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
    }
    static void pop(){
        head=head.next;
    }
    static void dispaly(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.val+" ");
            curr=curr.next;
        }
    }
    static void peek(){
        if(head==null){
            System.out.println("stack is empty");
            return;
        }
        int val=head.val;
        System.out.println("the peek element is"+val);
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        pop();
        dispaly();
        peek();
    }
}