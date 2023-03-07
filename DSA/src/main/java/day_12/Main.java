package day_12;



public class Main {
    // 5 -> 1(0 - 3)-6(N-7)
    //              5
    //            /   \
    //           1     6
    //         /  \   / \
    //        0   3  Null   7
    public static void main(String[] args) {

//        TreeNode node0 = new TreeNode(0);
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node6 = new TreeNode(6);
//
//        TreeNode root = node5;
//        node5.right = node1;
//        node5.left = node6;
//
//        node1.right = node3;
//        node1.left = node0;
//
//        node6.right = node4;
//        node6.left = node2;
//
//        System.out.println("Done");





        LC701 test = new LC701();
        TreeNode root = null;
        root = test.insertIntoBST(root,5);
        root = test.insertIntoBST(root,1);
        root = test.insertIntoBST(root,7);
        root = test.insertIntoBST(root,0);
        root = test.insertIntoBST(root,3);
        root = test.insertIntoBST(root,6);
        root = test.insertIntoBST(root,8);

        preorder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postorder(root);
        System.out.println("Done");


    }

    private static  void preorder(TreeNode root){
        if (root == null){
            return;
        }
        // process current code
        System.out.print(root.val + "-->");
        // left subtree
        preorder(root.left);
        // right subtree
        preorder(root.right);
    }

    private static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        // L N R
        inOrder(root.left);

        System.out.print(root.val + " ->");

        inOrder(root.right);

    }

    private static void postorder(TreeNode root){
        if (root == null){
            return;
        }
        // L R N
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ->");

    }
}
