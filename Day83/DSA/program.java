package Day83.DSA;

import java.util.ArrayList;

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
    static ArrayList<Integer> list=new ArrayList<>();
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
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public static void main(String[] args) {
        int[] nodes={5,3,1,-1,2,-1,-1,4,-1,-1,7,6,-1,-1,8,-1,-1};
        Node root=binaryTree(nodes);
        int k=4;

        inorder(root);

        System.out.println(list.get(k-1));
    }
}
