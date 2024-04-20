package Day69.DSA;

public class program1 {
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);

        Node head=LL.head;

        Node dummy=new Node(-1000);
        dummy.next=head;

        Node curr=dummy.next;

        while(curr.next!=null){
            curr=curr.next;
        }

        curr.next=dummy.next.next;


        Node slow=dummy.next;
        Node fast=dummy.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println(true);
                break;
            }
        }



    }
}
