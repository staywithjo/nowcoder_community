package jo.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Date:2023/11/27
 * Author:Jo
 * Description:文件复制
 */
public class CopyFile {
    public static void main(String[] args) {
        //文件复制
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("/Users/**/test/mytext.txt");
            fos = new FileOutputStream("/Users/**/test/mytextcopy.txt");

            int len;
            byte[] data = new byte[1024];

            while((len = fis.read(data)) != -1){
                fos.write(data,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }



    }
}
