package r.leetcode;

import java.util.List;

/**
 * Date:2024/10/29
 * Author:Jo
 * Description:206.反转链表
 */
public class LeetCode206 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
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
        public ListNode reverseList(ListNode head) {
            if(head == null){
                return  null;
            }
            ListNode startNode = head;
            ListNode nextNode = null;
            while(head.next != null){
                nextNode = head.next;
                head.next = startNode;
                startNode = head;
                head = nextNode;
            }
            return startNode;
        }
    }
}
