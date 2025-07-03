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
    static void Inorder(TreeNode root,List<Integer> li){
        if(root==null)return;
        Inorder(root.left,li);
        li.add(root.val);
        Inorder(root.right,li);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        Inorder(root,li);
        for(int i=0;i<li.size()-1;i++){
            if(li.get(i)>=li.get(i+1)){
                return false;
            }
        }
        return true;
    }

}