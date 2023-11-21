package r.leetcode;

/**
 * Date:2023/11/21
 * Author:Jo
 * Description:回文数
 */
public class L9 {
//    给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//
//    回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
//    例如，121 是回文，而 123 不是。
     class Solution {
        public boolean isPalindrome(int x) {
            //x必须非负数
            if(x < 0){
                return false;
            }
            int y = 0;
            int i = x;
            while(0 != i){
                y = y * 10 + i % 10;
                i = i / 10;
            }
            return y == x;
        }
    }
}
