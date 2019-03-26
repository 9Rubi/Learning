package j11.leetcode;


import java.util.HashMap;
import java.util.Map;

/**
 * @author : Rubi
 * @version : 2019-03-20 22:18 下午
 */
public class TestLeet {
    //    @Test
    public void mai() {
       /* int[] nums = new int[]{20, 2, 7, 11, 15};
        int target = 26;

        int[] ints = twoSum(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }*/


    }


    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public void test1() {
//        输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);
        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);

//        ListNode listNode = listNode1;

        long start = System.currentTimeMillis();
        ListNode listNode = addTwoNumbers(listNode1, listNode2);
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - start));

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }



}
