package Day62.DSA;
public class program1 {

    static Node displayReverse(Node head){
        Node reverseElement=null;
        while(head!=null){
            Node temp=head.next;
            head.next=reverseElement;
            reverseElement=head;
            head=temp;
        } 

        return reverseElement;
    }
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);

        Node head=LL.head;

        Node reverElement=displayReverse(head);
        
        while(reverElement.next!=null){
            System.out.print(reverElement.data+"-->");
            reverElement=reverElement.next;
        }
        System.out.print(reverElement.data);


    }
}
