package Day72.DSA;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int data){
        this.val=data;
        this.left=null;
        this.right=null;
    }
}
public class program {
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
    static void levelOrder(Node root){
        if(root==null){
            return;
        }
        int numberNodes=0;
        int levelOrder=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currentNode=q.remove();
            if(currentNode==null){
                levelOrder++;
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currentNode.val+" ");
                numberNodes++;
                if(currentNode.left!=null){
                    q.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.add(currentNode.right);
                }
            }
        }
        System.out.println("number of nodes are "+numberNodes);
        System.out.println("levels of the tree are "+levelOrder);

    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=binarytree(nodes);
        levelOrder(root);
    }
}
