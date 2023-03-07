package day_12;

import java.util.LinkedList;
import java.util.List;

public class LC144 {
    public  List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        preorder(root,res);
        return res;
    }
    private static  void preorder(TreeNode root,List<Integer> res){
        if (root == null){
            return;
        }
        // process current code
        res.add(root.val);
        // left subtree
        preorder(root.left,res);
        // right subtree
        preorder(root.right,res);
    }
}
