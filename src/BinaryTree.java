import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class BinaryTree {
        public TreeNode root;
        BinaryTree(){root=null;}

        List<Integer> l = new ArrayList<Integer>();
        public List inorderTraversal(TreeNode root) {
            if (root == null) return l;
            inorderTraversal(root.left);
            l.add(root.val);
            inorderTraversal(root.right);
            return l;
        }

}
