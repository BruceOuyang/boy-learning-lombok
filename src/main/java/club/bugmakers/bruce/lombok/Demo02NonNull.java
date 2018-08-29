package club.bugmakers.bruce.lombok;

import lombok.NonNull;

/**
 * @description: @NonNull：能够为方法或构造函数的参数提供非空检查
 * @author: ouyangqiangqiang
 * @date: 2018/8/29 11:59
 */
public class Demo02NonNull {

    public void notNullExample(@NonNull Integer id) {
        // doSomething
    }

    // 相当于
    public void notNullExample2(Integer id) {
        if (id == null) {

        } else {
            throw new NullPointerException("null");
        }
    }
}
