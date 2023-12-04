package r.algorithm;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Date:2023/12/4
 * Author:Jo
 * Description:数组
 */
public class Array {
    public static void main(String[] args) {
        //数组初始化
        int[] arr = new int[5];//{0,0,0,0,0}
        //遍历元素
        for (int i : arr) {
            System.out.println(i);//0 0 0 0 0
        }
        //遍历元素
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
            System.out.println(arr[i]);//2，3，4，5，6
        }
        //访问元素
        System.out.println("访问元素"+randomAccess(arr));
        //插入元素
        insertNum(arr,998,1);
        //删除元素
        delNum(arr,1);
        //查找元素
        System.out.println("查找指定元素下标："+getTarget(arr,3));
        //扩容数组
        extendArr(arr,10);
    }
    //遍历数组
    static void getArr(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
    //访问元素
    static int randomAccess(int[] arr){
        //随机下标[0,arr.length)
        int randomIndex = ThreadLocalRandom.current().nextInt(0,arr.length);
        //获取数组中该下标的元素
        int randomNum = arr[randomIndex];
        return randomNum;
    }
    //插入元素
    static void insertNum(int[] arr,int insertNum,int insertIndex){
        for (int i = arr.length - 1;i > insertIndex;i--) {
            arr[i] = arr[i-1];
        }
        arr[insertIndex] = insertNum;
        System.out.println("插入元素");
        getArr(arr);
    }
    //删除元素
    static void delNum(int[] arr,int index){
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        System.out.println("删除元素");
        getArr(arr);
    }
    //查找元素
    //查找指定元素下标
    static int getTarget(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    //扩容数组
    static void extendArr(int[] arr, int enlarge){
        System.out.println("扩容数组");
    //数组的长度是不可变的
        int[] newArr = new int[arr.length + enlarge];
        for (int i = 0 ;i < arr.length;i++){
            newArr[i] = arr[i];
        }
        getArr(newArr);
    }
}
