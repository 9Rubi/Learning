package j11.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Rubi
 * @version : 2019-03-25 15:27 下午
 */
public class N叉树的后序遍历 {

    /**
     * 给定一个 N 叉树，返回其节点值的后序遍历。
     * <p>
     * 例如，给定一个 3叉树 :
     * <pre>
     *
     *                   1
     *                 / | \
     *                3  2  4
     *              /  \
     *             5    6
     * </pre>
     * 返回其后序遍历: [5,6,3,2,4,1].
     * <p>
     * <p>
     * <p>
     * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
     */
    public static void main(String[] args) {

        Node node_5 = new Node();
        node_5.val = 5;
        Node node_6 = new Node();
        node_6.val = 6;
        Node node_3 = new Node();
        node_3.val = 3;
        node_3.children = new ArrayList<>();
        node_3.children.add(node_5);
        node_3.children.add(node_6);

        Node node_2 = new Node();
        node_2.val = 2;
        Node node_4 = new Node();
        node_4.val = 4;

        Node root = new Node();
        root.val = 1;
        root.children = new ArrayList<>();
        root.children.add(node_3);
        root.children.add(node_2);
        root.children.add(node_4);
        List<Integer> result = postorder(root);
        result.forEach(System.out::println);

    }

    public static List<Integer> postorder(Node root) {
        List<Integer> list  = new ArrayList<>();
        helper(root,list);
        return list;
    }


    public static void helper(Node root,List<Integer> list){
        if (root==null)
            return;
        if (root.children != null) {
            for(Node child:root.children) {
                helper(child,list);
            }
        }

        list.add(root.val);
    }
}
