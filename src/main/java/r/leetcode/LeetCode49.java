package r.leetcode;

import java.util.*;

/**
 * Date:2024/9/26
 * Author:Jo
 * Description:49.字母异位词分组 hot100
 */
public class LeetCode49 {
    public static void main(String[] args) {
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
