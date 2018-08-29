package club.bugmakers.bruce.lombok;

import lombok.ToString;

/**
 * @description: @ToString：为使用该注解的类生成一个toString方法，默认的toString格式为：ClassName(fieldName= fieleValue ,fieldName1=fieleValue)
 * @author: ouyangqiangqiang
 * @date: 2018/8/29 15:17
 */
@ToString(callSuper=true,exclude="other")
public class Demo05ToString extends Demo {

    private boolean someBoolean = true;
    private String content = "askdfj";
    private String other = "sldkjfkd";
}

/**
 * 相当于
 */
class Demo05Compare extends Demo {

    private boolean someBoolean = true;
    private String content = "askdfj";
    private String other = "sldkjfkd";

    @Override
    public String toString() {
        return "Foo(super=" + super.toString() +
                ", someBoolean=" + someBoolean +
                ", content=" + content;
    }
}
