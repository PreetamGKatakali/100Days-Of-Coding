package Day70.DSA;

public class program1 {
    //reverse
    static Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newNode=reverse(head.next);

        Node front=head.next;

        front.next=head;

        head.next=null;

        return newNode;
    } 
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        printLinkedList(head);

        System.out.println("------------------------");

        printLinkedList(reverse(head));
    }
}
