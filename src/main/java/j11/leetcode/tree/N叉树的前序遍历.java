package j11.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Rubi
 * @version : 2019-03-26 20:50 下午
 */
public class N叉树的前序遍历 {
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
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }


    public static void helper(Node root, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.val);
        if (root.children != null) {
            for (Node child : root.children) {
                helper(child, list);
            }
        }

    }
}
