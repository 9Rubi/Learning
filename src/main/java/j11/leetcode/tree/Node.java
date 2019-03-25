package j11.leetcode.tree;

import java.util.List;

/**
 * @author : Rubi
 * @version : 2019-03-25 15:27 下午
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
