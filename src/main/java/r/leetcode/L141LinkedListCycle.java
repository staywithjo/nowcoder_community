package r.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Date:2023/12/19
 * Author:Jo
 * Description:141. 环形链表
 */
public class L141LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public class Solution {
        //Func1 哈希表
        public boolean hasCycleFunc1(ListNode head) {
            Set<ListNode> set = new HashSet<>();
            while (head != null){
                if(!set.contains(head)){
                    set.add(head);
                    head = head.next;
                } else {
                    return true;
                }
            }
            return false;
        }
        //双指针 Floyd 判圈算法（Floyd's Cycle Detection Algorithm）龟兔赛跑
        public boolean hasCycleFunc2(ListNode head) {
            if(head == null || head.next == null){
                return false;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            while(slow != fast){
                if(fast == null || fast.next == null){
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }
    }
}
