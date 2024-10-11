package r.leetcode;

/**
 * Date:2024/10/11
 * Author:Jo
 * Description:209. 长度最小的子数组
 */
public class LeetCode209 {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            if (nums.length < 1) {
                return 0;
            }
            int start = 0;
            int end = 0;
            int sum = 0;
            int minLength = Integer.MAX_VALUE;//注意⚠️
            while (end < nums.length) {
                sum += nums[end];
                while (sum >= target) {
                    minLength = Math.min(end - start + 1, minLength);
                    sum -= nums[start];
                    start++;
                }
                end++;
            }
            return minLength == Integer.MAX_VALUE ? 0 : minLength;
        }
    }
}
