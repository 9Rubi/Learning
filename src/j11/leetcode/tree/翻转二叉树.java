package j11.leetcode.tree;

/**
 * @author : Rubi
 * @version : 2019-03-24 16:38 下午
 */
public class 翻转二叉树 {
    /**
     * 翻转一棵二叉树。
     * <p>
     * 示例：
     * <p>
     * 输入：
     * <pre>
     *
     *      4
     *    /   \
     *   2     7
     *  / \   / \
     * 1   3 6   9
     * </pre>
     * 输出：
     * <pre>
     *      4
     *    /   \
     *   7     2
     *  / \   / \
     * 9   6 3   1
     * </pre>
     * 备注:
     * 这个问题是受到 Max Howell 的 原问题 启发的 ：
     * <p>
     * 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
     *
     * @param args
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        invertTree(root);
        System.out.println(root);

    }

    public static TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }

    public static void helper(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.right;
            root.right = root.left;
            root.left = tmp;
            helper(root.left);
            helper(root.right);
        }
    }

}
