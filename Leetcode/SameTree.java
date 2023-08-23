import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    private void preOrderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            result.add(-21667323);
            return;
        }

        preOrderHelper(node.left, result);
        preOrderHelper(node.right, result);
        result.add(node.val);
    }

    public int[] preOrderTraversal(TreeNode root) {
        if (root == null) {
            return new int[0]; // Return an empty array if the tree is empty
        }

        List<Integer> result = new ArrayList<>();
        preOrderHelper(root, result);

        // Convert the list to an array
        int[] arrayResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrayResult[i] = result.get(i);
        }

        return arrayResult;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        int[] arr1 = preOrderTraversal(p);
        int[] arr2 = preOrderTraversal(q);

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}

public class SameTree {
    public static void main(String[] args) {
        // Create example tree nodes
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.left = null;
        q.right = new TreeNode(1);

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Check if the trees are the same
        boolean sameTree = solution.isSameTree(p, q);
        System.out.println("Are the trees the same? " + sameTree);
    }
}
