package club.bugmakers.bruce.lombok;

import lombok.*;

/**
 * @description: @NoArgsConstructor, @RequiredArgsConstructor, @AllArgsConstructor,这几个注解分别为类自动生成了无参构造器、指定参数的构造器和包含所有参数的构造器
 * @author: ouyangqiangqiang
 * @date: 2018/8/29 15:40
 */
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Demo07ArgsContructor {
    private Integer id;
    @NonNull private String name;
}

/**
 * 相当于
 */
class Demo07Compare {
    private Integer id;
    private String name;

    public Demo07Compare () {
    }

    private Demo07Compare (String name) {
        this.name = name;
    }

    public static Demo07Compare of (String name) {
        if (name == null) {
            throw new NullPointerException("name");
        }
        return new Demo07Compare(name);
    }

    protected Demo07Compare(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
