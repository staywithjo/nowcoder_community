package r.leetcode;


/**
 * Date:2023/12/11
 * Author:Jo
 * Description:反转双向循环链表
 */
public class ReverseDoubleList {

    class DoubleList{
        int val;
        DoubleList next;

        DoubleList last;

        DoubleList() {
        }

        DoubleList(int val) {
            this.val = val;
        }

        DoubleList(int val, DoubleList next,DoubleList last) {
            this.val = val;
            this.next = next;
            this.last = last;
        }
    }
    class Solution {
          public DoubleList ReverseDoubleList(DoubleList head){
              if(head == null){
                  return head;
              }

              DoubleList pre = null;
              DoubleList next = null;
              while (head != null){
                  next = head.next;
                  head.next = pre;
                  head.last = next;
                  pre = head;
                  head = next;
              }
              return pre;
        }
    }
}
