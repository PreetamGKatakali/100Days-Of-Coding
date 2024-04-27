package Day74.DSA;


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

    static boolean printAncestor(Node root,int data){
        if(root==null){
            return false;
        }
        if(root.val==data){
            return true;
        }
        if(printAncestor(root.left, data) || printAncestor(root.right, data)){
            System.out.print(root.val+" ");
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=binaryTree(nodes);

        printAncestor(root, 5);


    }
}
