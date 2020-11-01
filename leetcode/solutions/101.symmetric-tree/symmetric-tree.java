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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode b, TreeNode d) {
        if (b == null && d == null) {
            return true;
        } else if (b != null && d != null && b.val == d.val) {
            return isSymmetric(b.left, d.right) && isSymmetric(b.right, d.left);
        } else {
            return false;
        }
    }
}