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
    int sum=0;
    public int sumNumbers(TreeNode root) {
       solve(root,0);
       return sum; 
    }
    public void solve(TreeNode root,int curr){
        if(root==null) return ;
        curr=curr*10+root.val;

        if(root.left==null&&root.right==null){
         sum+=curr;
         return;
        }

        solve(root.left,curr);
        solve(root.right,curr);
        
    }
}