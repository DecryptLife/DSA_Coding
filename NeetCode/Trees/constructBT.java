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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }

        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);

        return root;
        
    }

    
    public TreeNode buildTree(int preorder[],int preStart,int preEnd,int inorder[],int inStart,int inEnd,Map<Integer,Integer> inMap){
        
        // Base case: if the start index is greater than the end index for either array, return null
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }

        // Create a new node with the value at the start index of the preorder array
        TreeNode root = new TreeNode(preorder[preStart]);

        // Find the index of the root value in the inorder array
        int inRoot = inMap.get(root.val);

        // Calculate the number of nodes in the left subtree
        int numsLeft = inRoot - inStart;

        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft,
                             inorder, inStart, inRoot - 1, inMap);

        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd,
                             inorder, inRoot + 1, inEnd, inMap);

        // Return the root of the subtree
        return root;
    }
}