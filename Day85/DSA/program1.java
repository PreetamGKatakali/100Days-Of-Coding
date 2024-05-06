package Day85.DSA;

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
    static boolean isFullBts(Node root){
        if(root==null){
            return true;
        }
        if(root.left==null && root.left==null){
            return true;
        }
        if((root.left!=null) && (root.right!=null)){
            return  (isFullBts(root.left) && isFullBts(root.right));
        }
        return false;
    }
    public static void main(String[] args) {
         int[] nodes={5,3,1,-1,2,-1,-1,4,-1,-1,7,6,-1,-1,8,-1,-1};
        Node root=binaryTree(nodes);

        System.out.println(isFullBts(root));


    }
}
