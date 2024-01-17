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

    private static int number = 0;
    private static int counter =0;


    public int kthSmallest(TreeNode root, int k) {
        if(root == null || k <= 0) return -1;
        counter = k;
       
        helper(root, k);
        return  number;
        
    }

    public void helper(TreeNode root,int k){
        

        if(root.left != null) helper(root.left,k);

        counter--;
        if(counter == 0){
            number = root.val;
            return;
        }

        if(root.right != null) helper(root.right,k);
        
    }
    
}