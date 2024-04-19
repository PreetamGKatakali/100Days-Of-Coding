package Day68.DSA;
public class program1 {
    static int getNode(Node head,int n){
        int count=0;
        if(head==null){
            return -1;
        }
        if(count==n){
            return head.data;
        }
        return getNode(head.next,n-1);
    }
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);
        LL.addlast(50);

        Node head=LL.head;

        System.out.println(getNode(head, 3));
        
    }
}
