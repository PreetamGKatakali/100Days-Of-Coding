package Day70.DSA;

import java.util.HashMap;

/**Clone the linked list */
class Node {
    int val;
    Node next;
    Node random;
    Node(int value) {
        val = value;
        next = null;
        random = null;
    }
}
public class program{
    static Node getCopyLinkedList(Node head){
        HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            Node neNode=new Node(temp.val);
            map.put(temp, neNode);
            temp=temp.next;
        }

        Node t=head;
        while(t!=null){
            Node newNode=map.get(t);
            newNode.next=(t.next!=null)?map.get(t.next):null;
            newNode.random=(t.random!=null)?map.get(t.random):null;
            t=t.next;
        }
        return map.get(head);
    }
    static void printList(Node head) {
        while(head != null) {
            System.out.print(head.val+":");
            if(head.next != null)
            System.out.print(head.next.val);
            else
            System.out.print("NULL");
            if(head.random != null)
            System.out.print(","+head.random.val);
            else
            System.out.print(",NULL");
            System.out.println();
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head=null;

        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);

        head=node1;
        head.next=node2;
        head.next.next=node3;
        head.next.next.next=node4;

        head.random=node4;
        head.next.random=node1;
        head.next.next.random=null;
        head.next.next.next.random=node2;

        printList(head);

        System.out.println("------------------------------");

        printList(getCopyLinkedList(head));





        
    }
}