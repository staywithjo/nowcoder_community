package r.leetcode;

import java.util.Stack;

/**
 * Date:2023/12/18
 * Author:Jo
 * Description:232.用栈实现队列
 */
public class L232ImplementQueueUsingStacks {
    class MyQueue {

        public Stack<Integer> in;
        public Stack<Integer> out;

        public MyQueue() {
            in = new Stack<>();
            out = new Stack<>();
        }
        //从in到out
        //需要满足的条件：
        //1.out中没有数据才可以从in中倒数据
        //2.in中的数据要倒完
        public void intToOut(){
            if(out.isEmpty()){
                while (!in.isEmpty()){
                    out.push(in.pop());
                }
            }
        }

        public void push(int x) {
            in.push(x);
            intToOut();
        }

        public int pop() {
            intToOut();
            return out.pop();
        }

        public int peek() {
            intToOut();
            return out.peek();
        }

        public boolean empty() {
            return in.isEmpty() && out.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
