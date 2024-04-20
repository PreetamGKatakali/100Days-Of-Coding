package Day69.DSA;

public class program {
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);
        LL.addlast(50);

        Node head=LL.head;

        Node dummy=new Node(-1000);
        dummy.next=head;

        int left=2;
        int right=4;

        Node leftperv=dummy;
        Node currentNode=head;

        for(int i=0;i<left-1;i++){
            leftperv=leftperv.next;
            currentNode=currentNode.next;
        }

        Node sublisthead=currentNode;

        Node perv=null;
        for (int i=0;i<=right-left;i++) {
            Node nextNode=currentNode.next;
            currentNode.next=perv;
            perv=currentNode;
            currentNode=nextNode;
        }

        leftperv.next=perv;
        sublisthead.next=currentNode;
        

        LL.displayByHead(dummy.next);
    }
}
