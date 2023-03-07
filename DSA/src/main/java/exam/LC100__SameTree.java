package exam;

public class LC100__SameTree {
    // ử dụng đệ quy để xét từng nốt trái và từng nốt phải của 2 tree
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) { // 2 node đều null
            return true;
        } else if (p == null || q == null ) { // chỉ 1 trong 2 node null
            return false;
        } else if (p.val != q.val) { // val không bằng nhau
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // duyệt lại đồng thời cả left và right của 2 tree
        }
        // => O(n)
    }
}
