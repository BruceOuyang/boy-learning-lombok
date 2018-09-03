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
}

//    public void notNullExample(@NonNull String string) {
//        //方法内的代码
//    }
//
//    //=>上面代码相当于如下：
//
//    public void notNullExample(String string) {
//        if (string != null) {
//            //方法内的代码相当于如下：
//        } else {
//            throw new NullPointerException("null");
//        }
//    }