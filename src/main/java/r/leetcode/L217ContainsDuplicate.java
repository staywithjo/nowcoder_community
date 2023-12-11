package r.leetcode;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Date:2023/12/12
 * Author:Jo
 * Description:217存在重复元素
 */
public class L217ContainsDuplicate {
    class Solution {
        public boolean containsDuplicateFunc2(int[] nums) {
//            if(nums == null || nums.length == 0 || nums.length == 1){
//                return false;
//            }
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            if(nums.length > set.size()){
                return true;
            }
            return false;
        }
        //更简单一点
        public boolean containsDuplicateFunc3(int[] nums) {

            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if(set.contains(num)){
                    return true;
                }
                set.add(num);
            }

            return false;
        }
        //看到了题节精选里的---用装逼流
        public boolean containsDuplicateFunc4(int[] nums) {
            return IntStream.of(nums).distinct().count() != nums.length;
        }
        //无语 看错题了。。。。。我怎么写的这么恶心人。。。
        public boolean containsDuplicateFunc1(int[] nums) {
            if(nums == null || nums.length == 0 || nums.length == 1){
                return false;
            }

            Map<Integer,Integer> map = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                } else {
                    map.put(nums[i],1);
                }
            }

            for(Integer j : map.keySet()){
                if( map.get(j) > 1){
                    return true;
                }
            }
            return false;
        }
    }
}
