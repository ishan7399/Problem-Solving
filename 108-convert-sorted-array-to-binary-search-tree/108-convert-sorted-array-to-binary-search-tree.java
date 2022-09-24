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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)return null;
        
        return convertArrayToTree(nums,0,nums.length-1);
    }
    public TreeNode convertArrayToTree(int []nums,int left,int right){
        if(left>right)return null;
        int root = left+(right-left)/2;
        TreeNode node = new TreeNode(nums[root]);
        node.left= convertArrayToTree(nums,left,root-1);
        node.right=convertArrayToTree(nums,root+1,right);
        return node;
    }
}