package r.leetcode;

import java.util.*;

/**
 * Date:2023/11/25
 * Author:Jo
 * Description:有效的括号
 */
public class L20 {
//    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
    class Solution {
        public boolean isValid(String s) {
            //奇数直接返回false；
            if(s.length() % 2 == 1){
                return false;
            }
            //偶数再进行判断
            HashMap<Character,Character> hashMap = new HashMap<>();
            hashMap.put(')','(');
            hashMap.put('}','{');
            hashMap.put(']','[');

            LinkedList<Character> stack = new LinkedList<Character>();
            for(int i = 0;i < s.length();i++){
                char ch = s.charAt(i);
                if(hashMap.containsKey(ch)){
                    if(stack.isEmpty() || stack.peek() != hashMap.get(ch)){
                        return false;
                    }
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            return stack.isEmpty();
        }
    }

}
