package r.leetcode;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Date:2024/10/9
 * Author:Jo
 * Description:1436. 旅行终点站
 */
public class LeetCode1436 {
    public static void main(String[] args) {


    }

    public static String destCity(List<List<String>> paths) {

        if (paths.size() == 1) {
            return paths.get(0).get(1);
        }

        List<String> starts = new ArrayList<>();
        List<String> ends = new ArrayList<>();
        //获取所有起始点
        paths.forEach(o ->
                starts.add(o.get(0))
        );
        //获取所有终点
        paths.forEach(o ->
                ends.add(o.get(1))
        );

        ends.removeAll(starts);
        if(!ends.isEmpty()){
            return ends.get(0);
        }
        return  "";
    }
}
