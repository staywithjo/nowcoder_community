package r.leetcode;

/**
 * Date:2023/11/22
 * Author:Jo
 * Description:最长公共前缀
 */
public class L14 {
//    编写一个函数来查找字符串数组中的最长公共前缀。
//
//    如果不存在公共前缀，返回空字符串 ""。
//
//    示例 1：
//
//    输入：strs = ["flower","flow","flight"]
//    输出："fl"
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            //字符串数组为空 直接返回
            if(strs.length == 0){
                return "";
            }
            //取第一个元素
            String ans = strs[0];
            //循环字符串数组
            for(int i = 0; i < strs.length ;i++){
                int j = 0 ;//记录长度
                for(; j < ans.length() && j < strs[i].length() ; j++){
                    if(strs[i].charAt(j) != ans.charAt(j)){
                        break;
                    }
                }
                ans = ans.substring(0,j);
                if(ans.equals(""))
                    return ans;
            }
            return ans;
        }
    }
}
