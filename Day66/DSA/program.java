package Day66.DSA;

public class program {
    static Node reverse(Node head){
        Node perv=null;
        while(head!=null){
            Node temp=head.next;
            head.next=perv;
            perv=head;
            head=temp;
        }
        return perv;
    }
    public static void main(String[] args) {
        LL.addlast(1);
        LL.addlast(2);
        LL.addlast(3);
        LL.addlast(4);
        LL.addlast(5);
        LL.addlast(6);


        Node head=LL.head;

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node head1=reverse(slow);
        Node res=null;

        while(head!=null && head1!=null){
            Node temp=head.next;
            Node temp1=head1.next;

            head.next=res;
            res=head;

            head1.next=res;
            res=head1;

            head=temp;
            head1=temp1;
        }
  
        

        LL.displayByHead(reverse(res));

        


    }
}
