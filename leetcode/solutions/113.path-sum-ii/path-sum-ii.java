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
    public void pathSum(TreeNode root, int sum, List<Integer> list, List<List<Integer>> result) {
        if (root == null) return;
        list.add(root.val);
        if (root.left == null && root.right == null && sum - root.val == 0){
            result.add(new ArrayList<>(list));
        } else {
            pathSum(root.left, sum - root.val, list, result);
            pathSum(root.right, sum - root.val, list, result);
        }
        list.remove(list.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        pathSum(root,sum,list,result);
        return result;
    }
}