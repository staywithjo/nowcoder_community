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
            if (nums.length == 0) {
                return 0;
            }
            Arrays.sort(nums);
            for (int num : nums) {
                System.out.print(num + ",");
            }
            int max = 0;
            int cur = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] + 1 == nums[i + 1]) {
                    cur = cur + 1;
                } else if (nums[i] == nums[i + 1]) {

                } else {
                    max = Math.max(cur, max);
                    cur = 1;
                }
            }
            return Math.max(cur, max);
        }
    }
}
