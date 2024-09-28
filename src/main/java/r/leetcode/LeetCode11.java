package r.leetcode;

import java.sql.SQLOutput;
import java.util.HashMap;

/**
 * Date:2024/9/28
 * Author:Jo
 * Description:盛最多水的容器
 */
public class LeetCode11 {
    class Solution {
        public int maxArea(int[] height) {
            if (height.length < 2) {
                return 0;
            }
            int maxArea = 0;
            int curArea = 0;
            int j = height.length - 1;
            int i = 0;

            while (i < j) {
                curArea = (j - i) * (Math.min(height[i], height[j]));
                maxArea = Math.max(curArea, maxArea);
                int temp = height[i] > height[j] ? j-- : i++;
            }
            return maxArea;
        }
    }
}
