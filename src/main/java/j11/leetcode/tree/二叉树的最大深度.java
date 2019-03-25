package j11.leetcode.tree;

/**
 * @author : Rubi
 * @version : 2019-03-24 16:16 下午
 */
public class 二叉树的最大深度 {
    /**
     * 给定一个二叉树，找出其最大深度。
     * <p>
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     * <p>
     * 说明: 叶子节点是指没有子节点的节点。
     * <pre>
     * 示例：
     * 给定二叉树 [3,9,20,null,null,15,7]，
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * </pre>
     * 返回它的最大深度 3 。
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public static int maxDepth(TreeNode root) {
        int count = 0;
        if (loop(root)) {

        }
        return 0;
    }

    public static boolean loop(TreeNode treeNode) {
        return true;
    }


}
