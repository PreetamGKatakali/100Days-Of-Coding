package Day75.DSA;
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
public class program1 {
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
    
    static int countNUmberOfNodes(Node root){
        if (root==null) {
            return 0;
        }
        int left=countNUmberOfNodes(root.left);
        int right=countNUmberOfNodes(root.right);
        return left+right+1;
    }


    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=binaryTree(nodes); 

        System.out.println(countNUmberOfNodes(root));


    }
}
