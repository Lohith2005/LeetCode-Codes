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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        TreeNode curr=root;
        if(curr==null)return li;
        dfs(root,0,li);
        return li;
    }
    void dfs(TreeNode node,int depth,List<Integer> li){
        if(node==null)return;
        if(depth==li.size()){
            li.add(node.val);
        }
        dfs(node.right, depth+1, li);
        dfs(node.left, depth+1, li);
    }
}