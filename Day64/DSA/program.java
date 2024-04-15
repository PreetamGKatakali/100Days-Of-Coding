package Day64.DSA;
/**
 * remove the middle element from the LinkedList
 */
public class program {
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);
        LL.addlast(50);

        Node head=LL.head;

        Node slow=head;
        Node fast=head;
        fast=fast.next.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        if(slow!=null){
            slow.next=slow.next.next;
        }

        LL.display();





    }
}
