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
    }

//    public   void jedisExample(String[] args) {
//        try {
//            @Cleanup Jedis jedis =   redisService.getJedis();
//        } catch (Exception ex) {
//            logger.error(“Jedis异常:”,ex)
//        }
//
//        //=>上面代码相当于如下：
//        Jedis jedis= null;
//        try {
//            jedis = redisService.getJedis();
//        } catch (Exception e) {
//            logger.error(“Jedis异常:”,ex)
//        } finally {
//            if (jedis != null) {
//                try {
//                    jedis.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
}
