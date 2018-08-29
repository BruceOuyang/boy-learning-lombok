package club.bugmakers.bruce.lombok;

import lombok.val;

/**
 * @description: Val可以将变量申明是final类型
 * @author: ouyangqiangqiang
 * @date: 2018/8/29 11:55
 */
public class Demo01Val {

    public static void main(String [] args) {
        val a = "A";

        // 相当于
        final String a2 = "A";
    }
}
