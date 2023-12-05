package r.leetcode;

import r.algorithm.Array;

import static r.algorithm.Array.getArr;

/**
 * Date:2023/12/5
 * Author:Jo
 * Description:283. 移动零
 */
public class L283 {
    //    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//    请注意 ，必须在不复制数组的情况下原地对数组进行操作。
//    示例 1:
//    输入: nums = [0,1,0,3,12]
//    输出: [1,3,12,0,0]
//    示例 2:
//    输入: nums = [0]
//    输出: [0]
    public static void main(String[] args) {
        int[] nums = {0,1, 0,2, 0,3, 4, 5,0};
        Solution.moveZeroes(nums);
        getArr(nums);
        Solution.moveZeroes2(nums);
    }

    static class Solution {
        //方法一
        public static void moveZeroes(int[] nums) {
            int cur = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[cur] = nums[i];
                    cur += 1;
                }
            }
            for (int i = cur; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
        //方法二 LeetCode精选题解
        public static void moveZeroes2(int[] nums)  {
            int length;
            if (nums == null || (length = nums.length) == 0) {
                return;
            }
            int j = 0;
            for (int i = 0; i < length; i++) {
                if (nums[i] != 0) {
                    if (i > j) {
                        nums[j] = nums[i];
                        nums[i] = 0;
                    }
                    j++;
                }
            }
        }
    }
}
