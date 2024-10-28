package r.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date:2024/10/27
 * Author:Jo
 * Description:438. 找到字符串中所有字母异位词
 */
public class LeetCode438 {
    //滑动窗口1
    class Solution1 {
        public List<Integer> findAnagrams(String s, String p) {

            int slen = s.length();
            int plen = p.length();
            List<Integer> ans = new ArrayList<>();

            if (slen < plen) {
                return ans;
            }

            int sCount[] = new int[26];
            int pCount[] = new int[26];

            for (int i = 0; i < plen; ++i) {
                ++sCount[s.charAt(i) - 'a'];
                ++pCount[p.charAt(i) - 'a'];
            }

            if (Arrays.equals(sCount, pCount)) {
                ans.add(0);
            }

            for (int i = 0; i < slen - plen; ++i) {
                --sCount[s.charAt(i) - 'a'];
                ++sCount[s.charAt(i + plen) - 'a'];

                if(Arrays.equals(sCount,pCount)){
                    ans.add(i + 1);
                }
            }
            return ans;
        }
    }

    //智障解法
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int len = p.length();
            char[] ch = p.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < s.length() - len + 1; i++) {
                String tstr = s.substring(i, i + len);
                char[] tch = tstr.toCharArray();
                Arrays.sort(tch);
                String fstr = new String(tch);
                if (str.equals(fstr)) {
                    list.add(i);
                }
            }
            return list;
        }
    }
}
