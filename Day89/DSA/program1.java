package Day89.DSA;
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
    static Node root;

    static void insert(int[] nodes){
        for(int i=0;i<nodes.length;i++){
            root=binaryTree(root,nodes[i]);
        }
    }
    static Node binaryTree(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val%2==0){
            root.left=binaryTree(root.left, val);
        }
        else{
            root.right=binaryTree(root.right, val);
        }
        return root;
    }

    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] nodes={5,8,3,2,7};

        insert(nodes);

        inorder(root);
    }
}
