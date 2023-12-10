package r.leetcode;

import r.tset.Test;

/**
 * Date:2023/12/5
 * Author:Jo
 * Description:L206反转链表
 */
public class L206ReverseLinkedList {
    /**
     * Definition for singly-linked list.
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
//        给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
//        输入：head = [1,2,3,4,5]
//        输出：[5,4,3,2,1]

        //递归
        public ListNode reverseList(ListNode head) {

            if(head == null || head.next == null){
                return head;
            }

            ListNode ansNode = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return ansNode;
        }
        //双指针
        public ListNode reverseListFunc2(ListNode head) {

            if(head == null){
                return head;
            }
            ListNode currentNode = head;

            while(head.next != null){
                currentNode = head.next;
                ListNode tempNode = head.next.next;
                head.next = tempNode;
                currentNode.next = head;
            }

            return currentNode;
        }

        public ListNode reverseListFunc3(ListNode head) {

            if(head == null){
                return head;
            }
            ListNode currentNode = head;
            ListNode newHead = null;
            while(head.next != null){
                ListNode tempNode = head.next;
                currentNode.next = newHead;
                currentNode = head.next;
                head.next = tempNode;
            }

            return currentNode;
        }
    }
}
