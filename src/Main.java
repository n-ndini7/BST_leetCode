import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);


        System.out.println(
                "\nInorder traversal of binary tree is ");
        List<Integer> l = tree.inorderTraversal(tree.root);
        for(Integer i:l) System.out.println(i);
    }
}
