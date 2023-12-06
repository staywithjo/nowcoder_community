package r.algorithm;

/**
 * Date:2023/12/5
 * Author:Jo
 * Description:链表
 */
//相关题链表203 206
public class LinkedList {
    //链表
    //链表节点
    static class ListNode{
        /**
         * 节点值
         */
        int val;
        /**
         * 指向下一个节点的引用
         */
        ListNode next;
        /**
         * 构造函数
         */
        ListNode(int val){
            this.val = val;
        }

    }

    public static void main(String[] args) {
        //初始化链表
        //分为两步

        //第一步：初始化节点
        ListNode n0 = new ListNode(1);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(10);

        //第二步：构造节点之间的引用
        n0.next = n1;//通常用头节点作为链表的名称-->链表n0
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
    }
    //插入节点
    //在相邻的两个节点 n0 和 n1 之间插入一个新节点 P
    static void insertNode(ListNode n0,ListNode p){
        ListNode n1 = n0.next;
        p.next = n1;
        n0.next = p;
    }
    //删除节点
    //删除链表的节点 n0 之后的首个节点
    static void remove(ListNode n0) {
        //no -> p ->n1
        if(n0.next == null){
            return;
        }
        ListNode p = n0.next;
        ListNode n1 = p.next;
        n0.next = n1;
    }
    //访问节点
    static ListNode access(ListNode head, int index){
        for (int i = 0; i < index; i++) {
            if(head == null){
                return null;
            }
            head = head.next;
        }
        return head;
    }
    //查找节点
    static int find(ListNode head, int target){
        int index = 0;
        while(head != null){
            if(head.val == target){
                return index;
            }
            head = head.next;
            index++;
        }
        return -1;
    }
    //双向链表
    static class DoublyLinkedList{
        int val;
        /**
         *  指向后继节点的引用
         */
        DoublyLinkedList next;
        /**
         * 指向前驱节点的引用
         */
        DoublyLinkedList prev;

        DoublyLinkedList(int val){
            this.val = val;
        }
    }
    //插入节点
    static void insert(DoublyLinkedList n0, DoublyLinkedList p){
        DoublyLinkedList n1 = n0.next;
        p.next = n1;
        n0.next = p;
    }
}
