package Day66.DSA;
/**
 * swap the pairs in the linked list
 */
public class program1 {
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);
        LL.addlast(50);

        Node head=LL.head;

        while(head!=null && head.next!=null){
            int k=head.data;
            head.data=head.next.data;
            head.next.data=k;
            head=head.next.next;
        }

        LL.display();
    }
}
