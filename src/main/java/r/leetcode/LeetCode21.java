package r.leetcode;

/**
 * Date:2024/10/31
 * Author:Jo
 * Description:21. 合并两个有序链表
 */
public class LeetCode21 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode prehead = new ListNode(-1);
            ListNode pre = prehead;

            while (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    pre.next = list2;
                    list2 = list2.next;
                } else {
                    pre.next = list1;
                    list1 = list1.next;
                }
                pre = pre.next;
            }

            pre.next = list1 == null ? list2 : list1;

            return prehead.next;
        }
    }
}
