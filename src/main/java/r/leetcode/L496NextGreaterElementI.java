package r.leetcode;

/**
 * Date:2023/12/12
 * Author:Jo
 * Description:496. 下一个更大元素 I
 */
public class L496NextGreaterElementI {
    //    输入：nums1 = [4,1,2], nums2 = [1,3,4,2].
//    输出：[-1,3,-1]
    class Solution {
        //先暴力解
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] ans = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                ans[i] = -1;
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j] && j < nums2.length - 1) {
                        for (int k = j + 1; k < nums2.length; k++) {
                            if (nums1[i] < nums2[k]) {
                                ans[i] = nums2[k];
                                break;
                            }
                        }
                    }
                }

            }
            return ans;
        }
        //func2
        public int[] nextGreaterElementFunc2(int[] nums1, int[] nums2){

            int len1 = nums1.length;
            int len2 = nums2.length;

            int[] ans = new int[len1];

            for (int i = 0; i < len1; i++) {
                int j = 0;
                while (j < len2 && nums1[i] != nums2[j]){
                    j++;
                }
                int k = j + 1;
                while(k < len2 && nums2[k] < nums2[j]){
                    k++;
                }
                //k == len2 时证明右侧都被比较过了 且没有大于num1【i】的数
                ans[i] = k < len2 ? nums2[k] : -1;
            }
            return ans;
        }
        //func3 栈
    }
}
