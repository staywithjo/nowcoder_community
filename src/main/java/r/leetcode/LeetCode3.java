package r.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Date:2024/10/27
 * Author:Jo
 * Description:3. 无重复字符的最长子串
 */
public class LeetCode3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s.length() <= 1) {
                return s.length();
            }
            Set<Character> set = new HashSet<>();
            int max = 0;
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i != 0) {
                    set.remove(s.charAt(i - 1));
                }
                while (j < s.length() && !set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    j++;
                }
                max = Math.max(max, j - i);
            }
            return max;
        }
    }
}
