package Day73.DSA;
/**printing the left nodes of the tree */
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class program {
    static int index=-1;
    static Node binaryTree(int[] nodes){
        ++index;
        if(nodes[index]==-1){
            return null;
        }
        Node newNode=new Node(nodes[index]);
        newNode.left=binaryTree(nodes);
        newNode.right=binaryTree(nodes);
        return newNode;
    }
    static void printLeafNode(Node root){
        if(root==null){
            return;
        }
        //printing the Node only when the left aand the right node are empty
        if(root.left==null && root.right==null){
            System.out.print(root.val+" ");
        }
        if(root.left!=null){
            printLeafNode(root.left);
        }
        if(root.right!=null){
            printLeafNode(root.right);
        }
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=binaryTree(nodes);
        printLeafNode(root);
       
    }
}
