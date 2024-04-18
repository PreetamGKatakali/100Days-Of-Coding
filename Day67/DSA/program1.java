package Day67.DSA;
/**sorting the even and the odd format in th linked list  */
public class program1 {
    public static void main(String[] args) {
        LL.addlast(1);
        LL.addlast(2);
        LL.addlast(3);
        LL.addlast(4);

        Node head=LL.head;

        Node even=new Node(-1);
        Node odd=new Node(-2);
        Node tempeven=even;
        Node tempodd=odd;

        while(head!=null){
            Node temp=head.next;
            head.next=null;
            if(head.data%2==0){
                System.out.println(head.data);
                tempeven.next=head;
                tempeven=tempeven.next;
            }
            else{
                tempodd.next=head;
                tempodd=tempodd.next;
            }
            head=temp;
        }
        tempeven.next=odd.next;


        LL.displayByHead(even.next);
    }
}
