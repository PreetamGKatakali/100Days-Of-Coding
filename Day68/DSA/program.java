package Day68.DSA;
/**
 * delete the node from the taile of the linked list
 */
public class program{
    static Node reverse(Node head){
        Node perv=null;
        while (head!=null) {
            Node temp=head.next;
            head.next=perv;
            perv=head;
            head=temp;
        }
        return perv;
    }
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);

        Node head=LL.head;

        Node res=reverse(head);
        Node curr=new Node(-1);
        curr.next=res;

        int k=2;
        int count=1;
        while(res!=null){
            if(count==k){
                // res=res.next.next;
                // break;
                res=res.next;
                break;
                
            }
            
            System.out.print(res.data);
            res=res.next;
            count++;
        }

        LL.displayByHead(curr);




    }
}