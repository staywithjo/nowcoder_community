package r.algorithm;


import java.util.Stack;

/**
 * Date:2023/12/3
 * Author:Jo
 * Description:栈
 */
public class StackTest {
    public static void main(String[] args) {
        //stack 栈
        //先进先出
        /* 初始化栈 */
        Stack<Integer> stack = new Stack<>();

        /* 元素入栈 */
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(9);

        /* 访问栈顶元素 */
        int peek = stack.peek();
        System.out.println(peek);

        /* 元素出栈 */
        int pop = stack.pop();
        System.out.println(pop);

        /* 获取栈的长度 */
        int size = stack.size();
        System.out.println(size);

        /* 判断是否为空 */
        boolean isEmpty = stack.isEmpty();
        System.out.println(isEmpty);

    }
}
