package day_12;

public class LC701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null){
            root = newNode;
            return root;
        }
        // root != null
        // tìm vị trí để add new node vào
        TreeNode current = root;

        while (true){
            // nếu val > root
            // --> xét subtree bên phải
            if (val > current.val) {
                // xét subtree bên phải
                // nếu subtree phải null
                if (current.right == null){
                    current.right = newNode;
                    break;
                }else {
                    // di chuyển xống subtree bên phải
                    current = current.right;
                }
            }else {
                // xét subtree bên trái
                if (current.left == null){
                    // nối lun left vào newNode
                    current.left = newNode;
                    break;
                }else {
                    //
                    current = current.left;
                }
            }
        }
        return root;
    }


}
