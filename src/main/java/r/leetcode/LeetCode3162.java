package r.leetcode;

/**
 * Date:2024/10/10
 * Author:Jo
 * Description: 3162. 优质数对的总数1
 */
public class LeetCode3162 {
    //还在想有什么更好的解法呢，一看题解。。。不就是暴力解吗。。。
    //浪费时间
    class Solution {
        public int numberOfPairs(int[] nums1, int[] nums2, int k) {
            int res = 0;
            for (int i : nums1) {
                for (int j : nums2) {
                    if (i % (j * k) == 0) {
                        res++;
                    }
                }
            }
            return res;
        }
    }
}
