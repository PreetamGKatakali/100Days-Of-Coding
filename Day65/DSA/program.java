/**
 * write the program to add the element in the linked list in the kth element.
 */
public class program{
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);

        Node res=LL.head;
        Node head=res;

        int k=2;

        while(head!=null){
            Node newNode=new Node(70);
            if(k==1){
                newNode.next=res;
                res=newNode;
                break;
            }
            Node temp=head.next;
            if(k-1==1){
                
                head.next=newNode;
                newNode.next=temp;
                // System.out.print(head.data);
                break;
            }
            head=temp;
            k--;
        }

        LL.displayByHead(res);
    }
}