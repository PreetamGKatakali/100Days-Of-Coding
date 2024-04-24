package Day71.DSA;

public class program1 {
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
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    static void perOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        perOrder(root.left);
        perOrder(root.right);
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=binarytree(nodes);
        perOrder(root);
    }
}
