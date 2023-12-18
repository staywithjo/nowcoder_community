package r.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Date:2023/12/19
 * Author:Jo
 * Description:225. 用队列实现栈
 */
public class L225ImplementStackUsingQueues {
    class MyStack {
        public Queue<Integer> myQueue;
        public MyStack() {
            myQueue = new LinkedList<Integer>();
        }
        //添加
        public void push(int x) {
            //当前队列中元素的个数
            int size = myQueue.size();
            //将新的元素添加到队列末尾
            myQueue.offer(x);
            //将最新添加的元素之前的元素全部移除并且按序添加到队列末尾
            for (int i = 0; i < size; i++) {
                myQueue.offer(myQueue.poll());
            }
        }
        //出栈
        public int pop() {
            return myQueue.poll();
        }
        //访问栈顶元素
        public int top() {
            return myQueue.peek();
        }
        //判断队列是否为空
        public boolean empty() {
            return myQueue.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
