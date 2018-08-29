package club.bugmakers.bruce.lombok;

import lombok.Cleanup;
import lombok.val;

import java.io.*;

/**
 * @description: @Cleanup：能够自动释放资源
 * @author: ouyangqiangqiang
 * @date: 2018/8/29 12:02
 */
public class Demo03Cleanup {

    public static void main(String [] args) {
        val path = "/file.test";

//        try {
//              idea 的 lombok 插件好像不支持 @Cleanup ，这行代码会报错，提示要在finally里边去close
//            @Cleanup InputStream fis = new FileInputStream(path);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//         相当于
        InputStream fis = null;
        try {
            fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
