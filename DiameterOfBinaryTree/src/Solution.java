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

    public int getLeftmostPath(TreeNode root) {
        TreeNode cursor = root;
        int length= 0;

        if(cursor.left == null) {
            return 0;
        }

        while(cursor != null) {
            if(cursor.left == null) {
                cursor = cursor.right;
                length++;
            }
            else if(cursor.right == null) {
                cursor = cursor.left;
                length++;
            }
        }
        return length;
    }

    public void preOrder(TreeNode root) {
        System.out.println(root.val);
        if(root.left != null) {
           preOrder(root.left);
        }
        if(root.right != null) {
            preOrder(root.right);
        }
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


        TreeNode root2 = new TreeNode(14);
        root2.left = new TreeNode(17);
        root2.right = new TreeNode(11);
        root2.left.left = new TreeNode(9);
        root2.left.right = new TreeNode(53);
        root2.left.left.right = new TreeNode(13);

        sol.preOrder(root2);

        //System.out.println(sol.getLeftmostPath(root));
//        System.out.println(root.left.val);

        //System.out.println(root.right.val);
    }

}
