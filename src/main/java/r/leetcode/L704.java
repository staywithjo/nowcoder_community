package r.leetcode;

/**
 * Date:2023/11/12
 * Author:Jo
 * Description:二分查找
 */
public class L704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if(target > nums[right] || target < nums[left]){
            return -1;
        }
        while(left <= right){
            int middle = (left + right)/2;
            if(target > nums[middle]){
                left = middle + 1;
            }
            if(target < nums[middle]){
                right = middle - 1;
            }
            if(target == nums[middle]){
                return middle;
            }
        }
        return -1;
    }
}
