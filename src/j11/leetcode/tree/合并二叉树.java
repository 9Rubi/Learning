package j11.leetcode.tree;

/**
 * @author : Rubi
 * @version : 2019-03-24 15:54 下午
 */
public class 合并二叉树 {
    /**
     * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
     * <p>
     * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
     * <p>
     * 示例 1:
     * <pre>
     * 输入:
     * 	Tree 1                     Tree 2
     *           1                         2
     *          / \                       / \
     *         3   2                     1   3
     *        /                           \   \
     *       5                             4   7
     *
     * 输出:
     * 合并后的树:
     * 	     3
     * 	    / \
     * 	   4   5
     * 	  / \   \
     * 	 5   4   7
     * </pre>
     * 注意: 合并必须从两个树的根节点开始。
     *
     * @param args
     */
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(3);
        treeNode1.left.left = new TreeNode(5);
        treeNode1.right = new TreeNode(2);


        TreeNode treeNode2 = new TreeNode(2);
        treeNode2.left = new TreeNode(1);
        treeNode2.left.right = new TreeNode(4);
        treeNode2.right = new TreeNode(3);
        treeNode2.right.right = new TreeNode(7);

        TreeNode result = mergeTrees(treeNode1, treeNode2);
        printTree(result,true);
    }


    public static void printTree(TreeNode treeNode,boolean isLeft) {
        System.out.println(isLeft? treeNode.val :"   "+treeNode.val);
        if (treeNode.left!=null){
            printTree(treeNode.left,true);
        }
        if (treeNode.right!=null){
            printTree(treeNode.right,false);
        }
    }


    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 !=null && t2 != null){
            TreeNode node  = new  TreeNode(t1.val+t2.val);
            node.left = mergeTrees(t1.left,t2.left);
            node.right = mergeTrees(t1.right,t2.right);
            return node;
        }else{
            return t1 == null? t2:t1;
        }
    }
}
