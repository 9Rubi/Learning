package j11.leetcode.tree;

/**
 * @author : Rubi
 * @version : 2019-03-24 16:16 下午
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"val\":")
                .append(val);
        sb.append(",\"left\":")
                .append(left);
        sb.append(",\"right\":")
                .append(right);
        sb.append('}');
        return sb.toString();
    }
}
