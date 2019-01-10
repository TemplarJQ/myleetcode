/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> resList = new ArrayList<>();
        if(root==null){return resList;}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int cnt = 1;
        while(!queue.isEmpty()){
            double res = 0;
            int count = 0;
            int div = cnt;
            while(cnt>0){
                TreeNode sub = queue.poll();
                if(sub.left!=null){queue.offer(sub.left);count++;}
                if(sub.right!=null){queue.offer(sub.right);count++;}
                res += sub.val;
                cnt--;
            }
            resList.add(res/div);
            cnt = count;
        }
        return resList;
    }
}
