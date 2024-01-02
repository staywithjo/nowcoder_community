package r.leetcode;

/**
 * Date:2023/12/29
 * Author:Jo
 * Description:86. 分隔链表
 */
public class L86PartitionList {

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

        public ListNode partition(ListNode head, int x) {
            if (head == null) {
                return null;
            }

            ListNode leftHead = null;
            ListNode leftTail = null;
            ListNode rightHead = null;
            ListNode rightTail = null;
            ListNode cur = head;

            while (cur != null) {
                head = head.next;
                cur.next = null;
                if (cur.val < x) {
                    if (leftHead == null) {
                        leftHead = cur;
                    } else {
                        leftTail.next = cur;
                    }
                    leftTail = cur;
                } else {
                    if (rightHead == null) {
                        rightHead = cur;
                    } else {
                        rightTail.next = cur;
                    }
                    rightTail = cur;
                }
                cur = head;
            }

            if (leftHead == null) {
                return rightHead;
            } else {
                leftTail.next = rightHead;
            }
            return leftHead;
        }
    }
}
