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
        TreeNode cursor = root.left;
        int length= 0;

        if(cursor == null) {
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



    public static void main(String[] args) {
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

        Solution sol = new Solution();
        

        System.out.println(sol.getLeftmostPath(root));
//        System.out.println(root.left.val);
    }

}
