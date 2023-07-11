public class pathSum_trees {

     public class TreeNode {
      int val;
      TreeNode left;
        TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null)
            return false;

        return hasZero(root, targetSum);

    }



    public boolean hasZero(TreeNode root, int targetSum)
    {
        targetSum -= root.val;

        if(root != null && root.left == null && root.right==null)
        {
            if(targetSum == 0)
                return true;
            else
                return false;
        }

        return hasPathSum(root.left,targetSum)||hasPathSum(root.right,targetSum );
    }
}
