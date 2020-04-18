  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
 }

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return 0;
    }

    public static void main(String[] args) {
        //            1
        //           / \
        //          2   3
        //         / \
        //        4   5

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
    }

}
