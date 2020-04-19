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
    List<Integer> adjList = new ArrayList<>();
    //List<String> marked = new ArrayList<>();
    HashSet marked = new HashSet();

    public int diameterOfBinaryTree(TreeNode root) {


        return 0;
    }

  public void dfs(TreeNode node) {
        // Add visited node to marked HashSet
        this.marked.add(node.val);

        // Create an adjacent list for each node
        adjList.add(node.left.val);
        adjList.add(node.right.val);

        if(!marked.contains(node.val)) {
            for(Integer val: adjList) {
                dfs(val)
            }
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
        System.out.println("---");
        System.out.println(sol.depth);

        //System.out.println(sol.getLeftmostPath(root));
//        System.out.println(root.left.val);

        //System.out.println(root.right.val);
    }

}
