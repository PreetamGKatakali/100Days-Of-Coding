package Day71.DSA;
class Node{
    int val;
    Node left;
    Node right;
    Node(int data){
        this.val=data;
        this.left=null;
        this.right=null;
    }
}
public class program {
    static int index=-1;

    static Node binarytree(int[] nodes){
        ++index;
        if(nodes[index]==-1){
            return null;
        }
        Node newNode=new Node(nodes[index]);
        newNode.left=binarytree(nodes);
        newNode.right=binarytree(nodes);
        return newNode;
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=binarytree(nodes);
    }
}
