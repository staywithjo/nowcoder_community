package r.algorithm;

/**
 * Date:2023/11/17
 * Author:Jo
 * Description:二分法
 */
public class Code01 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,6,6,6,6,6,7,7,9,9,10,11,12,13};
        int num = 7;
        /*
        1.有序数组找到num
        2.有序数组中找到>=num最左的位置
        3.有序数组中找到<=num最右的位置
        */
        System.out.println("1.有序数组找到num： " + find(arr,num));
        System.out.println("2.有序数组中找到>=num最左的位置： " + numIndexLeft(arr,num));
        System.out.println("3.有序数组中找到<=num最右的位置： " + numIndexRight(arr,num));
    }

    /**
     * 有序数组中是否存在num
     * @param arr
     * @param num
     * @return
     */
    public static boolean find(int[] arr,int num){
        if(arr == null || 0 == arr.length){
            return false;
        }
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(num == arr[mid]){
                return true;
            } else if(num > arr[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    /**
     * 有序数组arr 寻找数组中大于等于>=num的最左位置
     * @param arr
     * @param num
     * @return
     */
    public static int numIndexLeft(int[] arr,int num){
        if(arr == null || 0 == arr.length){
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] >= num){
                ans = mid;
                right = mid -1;
            } else{
                left = mid +1;
            }
        }
        return ans;
    }

    /**
     * 有序数组中找到<=num最右的位置
     * @param arr
     * @param num
     * @return
     */
    public static int numIndexRight(int[] arr,int num){
        if(arr == null || 0 == arr.length){
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] <= num){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return ans;
    }
}
