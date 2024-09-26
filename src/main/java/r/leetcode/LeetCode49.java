package r.leetcode;

import java.util.*;

/**
 * Date:2024/9/26
 * Author:Jo
 * Description:49.字母异位词分组 hot100
 */
public class LeetCode49 {
    public static void main(String[] args) {
        //学会用getOrDefault()
//        map.getOrDefault(key,default);
//        判断是否存在key，如果存在，返回该key对应的value
//        若不存在，则返回这设置的默认值 default
        //49.字母异位词分组
        class Solution {
            public List<List<String>> groupAnagrams(String[] strs) {
                Map<String,List<String>> map = new HashMap<>();
                for (String str : strs) {
                    char []array = str.toCharArray();
                    Arrays.sort(array);
                    String key = new String(array);
                    List<String> list = map.getOrDefault(key,new ArrayList<>());
                    list.add(str);
                    map.put(key,list);
                }
                return new ArrayList<List<String>>(map.values());
            }
        }
    }

}
