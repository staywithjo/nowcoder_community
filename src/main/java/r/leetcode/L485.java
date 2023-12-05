package r.leetcode;

/**
 * Date:2023/12/5
 * Author:Jo
 * Description:最大连续 1 的个数
 */
public class L485 {
    //给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
//    示例 1：
//    输入：nums = [1,1,0,1,1,1]
//    输出：3
//    解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.

//    示例 2:
//    输入：nums = [1,0,1,1,0,1]
//    输出：2
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count = 0;
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 1){
                    count+=1;
                    max = max > count ? max : count;
                }else{
                    count = 0;
                }
            }
            return max;
        }
    }
}
