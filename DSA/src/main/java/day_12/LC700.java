package day_12;

public class LC700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val){
            return root;
        }
        if (val > root.val){
            return searchBST(root.right,val);
        }else {
            return searchBST(root.left,val);
        }
    }
}
