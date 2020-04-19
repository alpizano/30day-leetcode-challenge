import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
 }

class Solution {
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans -1;
    }

  public int depth(TreeNode node) {
      if(node == null) {
          return 0;
      }
      int L = depth(node.left);
      int R = depth(node.right);
      ans = Math.max(ans, L+R+1);

      return Math.max(L,R)+1;

  }



    public static void main(String[] args) {

        Solution sol = new Solution();

        //            1
        //           / \
        //          2   3
        //         / \
        //        4   5

        // Creating sample tree structure from above input
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        //            14
        //           /  \
        //         17    11
        //        / \
        //       9   53
        //        \
        //         13
        sol.diameterOfBinaryTree(root);

        TreeNode root2 = new TreeNode(14);
        root2.left = new TreeNode(17);
        root2.right = new TreeNode(11);
        root2.left.left = new TreeNode(9);
        root2.left.right = new TreeNode(53);
        root2.left.left.right = new TreeNode(13);

        //System.out.println(sol.getLeftmostPath(root));
//        System.out.println(root.left.val);

        //System.out.println(root.right.val);
    }

}
