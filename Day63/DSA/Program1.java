package Day63.DSA;
/**
 * add the two linked list only when the both linked list are same length
 */
public class Program1 {
    static Node reverse(Node head){
        Node prevNode=null;

        while(head!=null){
            Node temp=head.next;
            head.next=prevNode;
            prevNode=head;
            head=temp;
        }
        return prevNode;
    }
    public static void main(String[] args) {
        LL.addlast(2);
        LL.addlast(4);
        LL.addlast(3);

        Node head=reverse(LL.head);

        LL.head=null;

        LL.addlast(5);
        LL.addlast(6);
        LL.addlast(4);
        

        Node head1=reverse(LL.head);

        Node curr=new Node(-1000);
        Node temp=curr;

        int carry=0;
        while(head!=null && head1!=null){
            int sum=head.data+head1.data+carry;
            carry=sum/10;
            sum=sum%10;
            
            Node newNode=new Node(sum);

            temp.next=newNode;
            temp=temp.next;
            head=head.next;
            head1=head1.next;
        }

        LL.displayByHead(reverse(curr.next));
        
    }
}
