package r.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Date:2024/10/31
 * Author:Jo
 * Description:1.两数之和
 */
public class LeetCode1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; ++i) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{i, map.get(target - nums[i])};
                }
                map.put(nums[i], i);
            }
            return new int[0];
        }
    }


class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;
            while (j > i) {
                if (nums[i] + nums[j] == target) {
                    sum[0] = i;
                    sum[1] = j;
                    break;
                }
                j--;
            }
        }
        return sum;
    }
}

}
