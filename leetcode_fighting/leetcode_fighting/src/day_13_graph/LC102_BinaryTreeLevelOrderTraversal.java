package day_13_graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if (root == null) {
            return wrapList;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> subList = new LinkedList<>();
            int LevelNum = queue.size();
            for (int i = 0; i < LevelNum; i++) {
                // If left and rigth Values Exist It will add them
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                // Add the First Element removes it
                subList.add(queue.poll().val);
            }
            // Add Sub List Values in Main
            wrapList.add(subList);
        }
        return wrapList;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
