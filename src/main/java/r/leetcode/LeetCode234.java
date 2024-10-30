package r.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:2024/10/29
 * Author:Jo
 * Description:234.回文链表
 */
public class LeetCode234 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(ListNode next) {
            this.next = next;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }

            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            int i = 0;
            int j = list.size() - 1;
            while (j > i) {
                if (!list.get(i).equals(list.get(j))) {
                    return false;
                }
                ++i;
                --j;
            }
            return true;
        }
    }
}