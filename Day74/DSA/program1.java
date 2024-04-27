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
    static void printDiagonalsNode(Node root,int sum){
        if(root==null){
            if(sum!=0){
                System.out.println(sum);
            }
            return;
        }
        else{
            sum+=root.val;
        }
        printDiagonalsNode(root.right,sum);
        printDiagonalsNode(root.left,0);
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=binaryTree(nodes);

        printDiagonalsNode(root,0);


    }
}
