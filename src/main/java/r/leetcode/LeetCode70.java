package r.leetcode;

/**
 * Date:2024/10/26
 * Author:Jo
 * Description:70.爬楼梯
 */
public class LeetCode70 {
    class Solution {
        public int climbStairs(int n) {
            if (n <= 2) {
                return n;
            }

            int fun1 = 1;
            int fun2 = 2;
            int fun = 0;
            for (int i = 3; i <= n; i++) {
                fun = fun1 + fun2;
                fun1 = fun2;
                fun2 = fun;
            }

            return fun;
        }
    }
}
