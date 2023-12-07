package r.leetcode;

import r.algorithm.LinkedList;
import sun.security.util.SignatureUtil;

import static r.leetcode.L203RemoveLinkedListElements.Solution.removeElements;

/**
 * Date:2023/12/5
 * Author:Jo
 * Description:移除链表元素remove-linked-list-elements
 */
public class L203RemoveLinkedListElements {
//    给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
//    示例 1：
//    输入：head = [1,2,6,3,4,5,6], val = 6
//    输出：[1,2,3,4,5]
//    示例 2：
//    输入：head = [], val = 1
//    输出：[]

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
    static class Solution {
        //递归
        public static  ListNode removeElements(ListNode head, int val) {
            //    示例 1：
            //    输入：head = [1,2,6,3,4,5,6], val = 6
            //    输出：[1,2,3,4,5]
            if (head == null) {
                return null;
            }
            head.next = removeElements(head.next, val);

            if (head.val == val) {
                return head.next;
            } else {
                return head;
            }
        }
//太抽象了。。。。。脑袋疼。。。。。。
        //虚拟头结点
        public static  ListNode removeElementsFunc2(ListNode head, int val) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;
            while(prev.next != null){
                if(prev.next.val == val){
                   prev.next = prev.next.next;
                } else {
                    prev = prev.next;
                }
            }

            return dummy.next;
        }
    }

    static class ListNode {
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
}
