package Day64.DSA;
/**
 * rotate the linkedlist k times 
 * 10->20->30->40->50->null
 * output: 40->50->10->20->30->null
 */
public class program1 {
    static Node head; 
  
    class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    void push(int new_data) 
    { 
        // 1 & 2: Allocate the Node & Put in the data 
        Node new_node = new Node(new_data); 
  
        // 3. Make next of new Node as head  
        new_node.next = head; 
  
        // 4. Move the head to point to new Node  
        head = new_node; 
    } 
    public static void main(String[] args) {
        program1 llist = new program1(); 
  

        for (int i = 50; i >= 10; i -= 10) 
            llist.push(i); 

        Node start=head;
        Node last=head;

        while(last.next!=null){
            last=last.next;
        }

        int k=3;
        while (k!=0) {
             head=head.next;

             start.next=null;

             last.next=start;
             last=start;

             start=head;
             k--;
        }

        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null");
    }
}
