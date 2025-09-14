/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return false;
        }
        Stack<TreeNode> path=new Stack<>();
        Stack<Integer> pathSum=new Stack<>();
        path.push(root);
        pathSum.push(root.val);
        
        while(!path.isEmpty())
        {
            TreeNode temp=path.pop();
            int sum=pathSum.pop();
            if(temp.right==null && temp.left==null && sum==targetSum)
            {
                return true;
            }
            if(temp.right!=null)
            {
                path.push(temp.right);
                pathSum.push(sum + temp.right.val);
            }
            if(temp.left!=null)
            {
                path.push(temp.left);
                pathSum.push(sum + temp.left.val);
            }
        }
        return false;

    }
}