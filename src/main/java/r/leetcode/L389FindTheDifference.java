package r.leetcode;

import java.util.*;

/**
 * Date:2023/12/12
 * Author:Jo
 * Description:389.找不同
 */
public class L389FindTheDifference {
    class Solution {
        public char findTheDifference(String s, String t) {
            //妙啊 比简单多了
           int scount = 0;
           int tcount = 0;
            for (int i = 0; i < s.length(); i++) {
                scount+=s.charAt(i);
            }
            for (int i = 0; i < t.length(); i++) {
                tcount+=t.charAt(i);
            }
           return (char) (tcount - scount);
        }
    }
}
