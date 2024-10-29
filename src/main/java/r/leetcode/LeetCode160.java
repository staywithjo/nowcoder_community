package r.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Date:2024/10/29
 * Author:Jo
 * Description:160.相交链表
 */
public class LeetCode160 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }

            ListNode nodeA = headA;
            ListNode nodeB = headB;

            while (nodeA != nodeB) {
                nodeA = nodeA == null ? headB : nodeA.next;
                nodeB = nodeB == null ? headA : nodeB.next;
            }
            return nodeA;
        }
    }

    public class Solution2 {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            Set<ListNode> set = new HashSet<>();

            ListNode temp = headA;

            while (temp != null) {
                set.add(temp);
                temp = temp.next;
            }

            temp = headB;
            while (temp != null) {
                if (set.contains(temp)) {
                    return temp;
                }
                temp = temp.next;
            }
            return null;
        }
    }
}
