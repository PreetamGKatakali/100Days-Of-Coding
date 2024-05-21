package Day99.DSA;

import javax.swing.tree.TreeNode;

public class program{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null) return root;
        if(left != null) return left;
        if(right != null) return right;
        return null;
    }

    public static void main(String[] args) {
        //Node of the binary trees
    }
}