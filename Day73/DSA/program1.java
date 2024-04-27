package Day73.DSA;

import java.util.LinkedList;
import java.util.Queue;

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
     static int leveOfOrder(Node root,int hight) {
       int res=0;
       if(root==null){
        return 0;
       }
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       q.add(null);
       while(!q.isEmpty()){
        Node currentNode=q.remove();
        if(currentNode==null){
            res++;
            if(q.isEmpty()){
                break;
            }
            else{
               q.add(null); 
            }
        }
        else{
            if(currentNode.left!=null){
                q.add(currentNode.left);
            }
            if(currentNode.right!=null){
                q.add(currentNode.right);
            }
        }
       }
       return res;
    }
    static void printNodeByLevel(Node root,int level){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.print(root.val+" ");
            return;
        }
        printNodeByLevel(root.left, level-1);
        printNodeByLevel(root.right, level-1);
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=binaryTree(nodes);

        printNodeByLevel(root, 2);

    }
   
}
