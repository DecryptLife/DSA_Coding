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
    public int kthSmallest(TreeNode root, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.val);
        list = helper(root, list);
        Collections.sort(list);
        return list.get(k-1);
    }

    public ArrayList<Integer> helper(TreeNode root,ArrayList<Integer> list){
        if(root != null)
        {
            list.add(root.val);
        }

        if(root.left != null) helper(root.left, list);

        if(root.right != null) helper(root.right, list);
        
        return list;
    }
    
}