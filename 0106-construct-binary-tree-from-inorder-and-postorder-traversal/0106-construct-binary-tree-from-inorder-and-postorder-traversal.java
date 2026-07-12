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
    int index;
    public TreeNode solver(int[] postorder,int left,int right,HashMap<Integer,Integer>map){
       // index=postorder.length-1;
        if(left>right) return null;

        int rootvalues=postorder[index--];
        TreeNode root=new TreeNode(rootvalues);
        int mid=map.get(rootvalues);
         root.right=solver(postorder,mid+1,right,map);
        root.left=solver(postorder,left,mid-1,map);
       //root.right=solver(postorder,mid+1,right,map);

       return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
       } 
       index=postorder.length-1;
       return solver(postorder,0,inorder.length-1,map);
    }
}