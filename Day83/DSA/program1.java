package Day83.DSA;
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
    static void inorder(Node root,int k,int[] ksmallest,int[] count){
       if(root==null || count[0]>=k){
        return;
       }

       inorder(root.left, k, ksmallest, count);
       count[0]++;
       if(count[0]==k){
        ksmallest[0]=root.val;
        return;
       }
       inorder(root.right, k, ksmallest, count);
    }
    static void reverseInorder(Node root,int k,int[] count,int[] klargest){
        if(root==null || count[0]>=k){
            return;
        }
        reverseInorder(root.right, k, count, klargest);
        count[0]++;
        if(count[0]==k){
            klargest[0]=root.val;
            return;
        }
        reverseInorder(root.left, k, count, klargest);
    }
    static void finKth(Node root,int k){
        int[] kSmallest=new int[]{Integer.MIN_VALUE};
        int[] kLargest=new int[]{Integer.MIN_VALUE};
        int[] count=new int[]{0};

        inorder(root,k,kSmallest,count);

        System.out.println(kSmallest[0]);

        count[0]=0;

        reverseInorder(root, k, count, kLargest);

        System.out.println(kLargest[0]);

    }
    public static void main(String[] args) {
        int[] nodes={5,3,1,-1,2,-1,-1,4,-1,-1,7,6,-1,-1,8,-1,-1};
        Node root=binaryTree(nodes);

        finKth(root,4);
    }
}
