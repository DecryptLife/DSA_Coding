
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class bvtLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if( root == null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
           
           int len = queue.size();
           List<Integer> inner = new ArrayList<>();
           for(int i=0;i<len;i++){
               if(queue.peek().left != null) queue.offer(queue.peek().left);
               if(queue.peek().right != null) queue.offer(queue.peek().right);   
                
                inner.add(queue.poll().val);

           }

           res.add(inner);
        }
        return res;
    }
}