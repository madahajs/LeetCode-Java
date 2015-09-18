/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        int leftDepth;
        int rightDepth;
        if(root == null){
            return 0;
        }else{
            leftDepth = maxDepth(root.left);
            rightDepth = maxDepth(root.right);
            if(leftDepth > rightDepth){
                return leftDepth + 1;
            }else{
                return rightDepth + 1;
            }
        }
    }
}