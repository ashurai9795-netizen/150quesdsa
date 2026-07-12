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
    int index=0;
    public TreeNode solver(int[]preorder,int left,int right,HashMap<Integer,Integer>map){
        if(left>right) return null;
        int rot=preorder[index++];
        TreeNode root=new TreeNode (rot);
        int mid=map.get(rot);
        root.left=solver(preorder,left,mid-1,map);
        root.right=solver(preorder,mid+1,right,map);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<inorder.length;i++){
    map.put(inorder[i],i);
    }
    return solver(preorder,0,inorder.length-1,map);
    }
}