import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// finding the target in the BST
public class program{
     public boolean findTarget(TreeNode root, int k) 
    {
        List<Integer> l = new ArrayList<>();
        solve(root,l);
        
        Collections.sort(l);
        System.out.println(l);
        int i=0,j=l.size()-1;
        
        while(i<j)
        {
            int sum = l.get(i)+l.get(j);
            if(sum == k)
                return true;
            else if(sum>k)
                j-=1;
            else
                i+=1;
        }
        return false;
    }
    
    void solve(TreeNode root,List<Integer> l)
    {
        if(root == null)
            return;
        
        solve(root.left,l);
        l.add(root.val);
        solve(root.right,l);
    }
    public static void main(String[] args) {
        //Node in the Binary tree
    }
}