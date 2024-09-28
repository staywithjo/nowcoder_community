package r.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * Date:2024/9/26
 * Author:Jo
 * Description:128.最长连续序列
 */
public class LeetCode128 {
    class Solution {
        public int longestConsecutive(int[] nums) {
            Arrays.stream(nums).sorted();
            int max = 0;
            int cur = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    cur = cur + 1;
                } else {
                    max = Math.max(cur, max);
                    cur = 0;
                }
            }
            return max;
        }
    }
}
