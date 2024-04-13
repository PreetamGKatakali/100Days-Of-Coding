package Day62.DSA;
public class program{
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);

        int num=50;
        Node temp=new Node(num);

        Node head=LL.head;

        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        temp.next=slow.next;
        slow.next=temp;

        LL.display();
    }
}