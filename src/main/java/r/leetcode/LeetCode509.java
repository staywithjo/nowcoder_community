package r.leetcode;

import sun.print.SunMinMaxPage;

/**
 * Date:2024/10/14
 * Author:Jo
 * Description:509.斐波那契数
 */
public class LeetCode509 {
    // F(0) = 0，F(1) = 1
    // F(n) = F(n - 1) + F(n - 2)，其中 n > 1
    // 自下而上
    class Solution {
        public int fib(int n) {
            if (n < 2) {
                return n;
            }
            int fn_2 = 0;
            int fn_1 = 1;
            int fn = 0;
            for (int i = 2; i <= n; i++) {
                fn = fn_1 + fn_2;
                fn_2 = fn_1;
                fn_1 = fn;


            }
            return fn;
        }
    }
}
