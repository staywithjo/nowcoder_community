package jo.test;

/**
 * Date:2023/11/26
 * Author:Jo
 * Description:字符串和数组转换
 */
public class StrChange {

    public static void main(String[] args) {

        String str = "Hello, World!";

        // 使用默认字符集转换字符串为字节数组
        byte[] byteArray = str.getBytes();

        // 使用指定字符集转换字符串为字节数组
        // 使用UTF-8字符集
        // byte[] byteArray = str.getBytes(StandardCharsets.UTF_8);

        // 打印字节数组内容
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }

        System.out.println();

        //字节数组转换成字符串
        String string = new String(byteArray);
        //打印字符串
        System.out.println(string);
    }
}
