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
    public TreeNode invertTree(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return root;
        }
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree (temp);
        return root;
    }
}


public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null; 
        Stack<TreeNode> stack = new Stack<TreeNode>();  
        stack.push(root);  
        
        while(!stack.isEmpty()){  
            TreeNode cur = stack.pop();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp; 
            
            if(cur.left != null) stack.push(cur.left);  
            if(cur.right != null) stack.push(cur.right);  
        }  
        return root;
    }
}