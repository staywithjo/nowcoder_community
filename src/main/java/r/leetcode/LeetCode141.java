package r.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Date:2024/10/30
 * Author:Jo
 * Description:141.环形链表
 */
public class LeetCode141 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head == null || head.next == null){
                return false;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            while (slow != fast){
                if(fast == null || fast.next == null){
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return false;
        }
    }

    public class Solution0 {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }
            HashSet<ListNode> set = new HashSet<>();
            while (head != null) {
                if (!set.add(head)) {
                    return true;
                }
                head = head.next;
            }
            return false;
        }
    }
}
