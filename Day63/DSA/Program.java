package Day63.DSA;
/**
 * add the number in the middle of the linked list
 */
public class Program{
    static int getCount(Node head){
        if(head==null){
            return 0;
        }
        return 1+getCount(head.next);
    }
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);
 
   
        Node head=LL.head;
        int length=getCount(head);

        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        Node newNode=new Node(70);

        if(length%2==0){
            int count=length/2;

            Node curr=head;

            while(count-->1){
                curr=curr.next;

                newNode.next=curr.next;
                curr.next=newNode;
            }
        }
        else{
            newNode.next=slow.next;
            slow.next=newNode;
        }

        LL.displayByHead(head);
    }
}