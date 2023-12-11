package r.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date:2023/12/6
 * Author:Jo
 * Description:列表
 */
public class Lists {
    public static void main(String[] args) {
        /* 初始化列表 */
        // 无初始值
        List<Integer> nums = new ArrayList<>();
        // 有初始值（注意数组的元素类型需为 int[] 的包装类 Integer[]）
        Integer[] numbers = new Integer[] { 1, 3, 2, 5, 4 };
        List<Integer> newnums = new ArrayList<>(Arrays.asList(numbers));

        //访问元素
        //访问第一个元素
        System.out.println(newnums.get(0));

        //添加元素
        newnums.add(10000);
        //移除下标为1的元素
        newnums.remove(1);
        //拼接list
        List<Integer> list = Arrays.asList(new Integer[]{13,233,333});
        newnums.addAll(list);
        //遍历
        for (Integer newnum : newnums) {
            System.out.println(newnum);
        }
    }
}
